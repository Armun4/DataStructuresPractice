package com.sortingAlgorithms;

public class QuickSort {

    public void sort(int[]a){
        sort(a, 0, a.length-1);
    }
    private void sort(int[] a, int start, int end) {
    if (start >= end)
        return;
        int boundary = partition(a, start, end);


    sort(a, start, boundary-1);
    sort(a, boundary+1, end);

    }

    private int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int boundary = start-1;

        for(int i = start; i <=end; i++)
            if(a[i] <= pivot)
                swap(a, i, ++boundary);

         return boundary;
    }

    private void swap ( int[] items, int i1, int i2){
        int temp = items[i1];
        items[i1] = items[i2];
        items[i2] = temp;
    }
}
