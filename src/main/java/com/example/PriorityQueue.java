package com.example;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int size){
        items = new int[size];
    }
    public void add(int item) {
        if(isFull()){
            resizeArray();
        };
        int i = shitItemsToInsert(item);
        items[i] = item;
        count ++;

    }

    private int shitItemsToInsert(int item) {
        int i;
        for (i = count; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else break;
        }
        return i + 1;
    }

    public int remove() {
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];

    }

    private void resizeArray() {
        int[] items2 = new int[count * 2];
        for (int i = 0; i < count; i++)
            items2[i] = items[i];
        items = items2;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);

    }
    public boolean isFull(){
        return count == items.length;
    }
    public boolean isEmpty(){
        return count == 0;
    }
}
