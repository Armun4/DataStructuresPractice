package com.example;

import com.sortingAlgorithms.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test public void testThatArrayIsSorted(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] a ={9, 5, 8, 2, 1, 0 };
        bubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
        assertEquals(0, a[0]);

    }
}
