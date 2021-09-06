package com.example;

public class ArrayQueue {
    int[] items;
    int f = 0;
    int r = 0;
    int count = 0;

    public ArrayQueue(int length) {

        items = new int[length];
    }

    public void enqueue(int input){
        if(isFull())throw new StackOverflowError();
        items[r] = input;
        r = (r + 1) % items.length;
        count++;
    }
    public int dequeue(){
        if (isEmpty()) throw  new IllegalStateException();
        int item = items[f];
        items[f] = 0;
        f = (f+1)% items.length;
        count --;
        return item;
    }
    public int peek(){
        return items[f];
    }

    private boolean isEmpty() {
        return r==0;
    }
    private boolean isFull(){
        return count == items.length;
    }

}
