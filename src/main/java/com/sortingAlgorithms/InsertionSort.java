package com.sortingAlgorithms;

public class InsertionSort {
    public void sort(int[] a){
        for(int i = 0; i < a.length; i++){
            int current = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > current){
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
    }
}
