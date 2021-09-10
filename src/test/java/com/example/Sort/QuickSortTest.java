package com.example.Sort;

import com.sortingAlgorithms.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void testThatArrayIsSorted(){
        QuickSort sorter = new QuickSort();
        int[] a ={9, 5, 8, 2, 1, 0 };
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
        assertEquals(0, a[0]);

    }
}
