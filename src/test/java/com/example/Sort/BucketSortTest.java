package com.example.Sort;

import com.sortingAlgorithms.BucketSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BucketSortTest {



        @Test
        public void testCountingSort() {
            BucketSort sorter = new BucketSort();
            int[] a = {9, 5, 8, 2, 1, 0};
            sorter.sort(a, 4);
            System.out.println(Arrays.toString(a));
            assertEquals(0, a[0]);
        }

}


