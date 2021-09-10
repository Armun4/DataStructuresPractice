package com.example.Sort;

import com.sortingAlgorithms.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    @Test
    public void testThatArrayIsSorted(){
        SelectionSort sorter = new SelectionSort();
        int[] a ={9, 5, 8, 2, 1, 0 };
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
        assertEquals(0, a[0]);
    }
}
