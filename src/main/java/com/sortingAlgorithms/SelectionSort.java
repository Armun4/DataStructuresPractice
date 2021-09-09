package com.sortingAlgorithms;

public class SelectionSort {
    public void sort(int[] items){
        for(int i=0; i<items.length; i++){
            int minIndex = i;
            for(int j=i; j<items.length; j++){
                if(items[j]<items[minIndex])
                    minIndex = j;
                swap(items, minIndex, i);
            }
        }

    }


    private void swap ( int[] items, int i, int j){
        int temp = items[j];
        items[j] = items[i];
        items[i] = temp;
    }
}
