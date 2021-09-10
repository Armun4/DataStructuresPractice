package com.example.Sort;

import com.sortingAlgorithms.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void testThatArrayIsSorted(){
        MergeSort sorter = new MergeSort();
        int[] a ={9, 5, 8, 2, 1, 0 };
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
        assertEquals(0, a[0]);

    }
}
