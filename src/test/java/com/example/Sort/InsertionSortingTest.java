package com.example.Sort;

import com.sortingAlgorithms.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortingTest {

    @Test
    public void testThatArrayIsSorted(){
        InsertionSort sort = new InsertionSort();
        int[] a ={9, 5, 8, 2, 1, 0 };
        sort.sort(a);
        System.out.println(Arrays.toString(a));
        assertEquals(0, a[0]);

    }
}
