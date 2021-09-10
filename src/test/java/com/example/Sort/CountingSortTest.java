package com.example.Sort;

import com.sortingAlgorithms.CountingSort;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import java.util.Arrays;

public class CountingSortTest {

    @Test  public void testCountingSort() {
        CountingSort sorter = new CountingSort();
    int[] a = {9, 5, 8, 2, 1, 0};
    sorter.sort(a, 9);
    System.out.println(Arrays.toString(a));
    assertEquals(0, a[0]);
}

}
