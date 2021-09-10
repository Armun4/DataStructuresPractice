package com.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void sort(int[] a, int numberOfBuckets) {

        List<List<Integer>> buckets = new ArrayList();
        for (int  i = 0; i < numberOfBuckets; i++)
            buckets.add(new ArrayList<Integer>());

        for (int item : a)
            buckets.get(item/numberOfBuckets).add(item);

        int i = 0;
        for( List bucket : buckets){
            Collections.sort(bucket);
            for ( Object item : bucket)
                a[i++] = (Integer)item;
        }



    }




}
