package com.sortingAlgorithms;

import java.util.Arrays;

public class CountingSort {



    public void sort(int[] a,int max){
        int[] counts = new int[max + 1];
        for (int item :  a)
            counts[item]++;
        int k = 0;
        for (int i = 0; i < counts.length; i++)
            for(int j = 0; j < counts[i]; j++)
                a[k++]= i;

    }
}
