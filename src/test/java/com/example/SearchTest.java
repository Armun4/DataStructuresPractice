package com.example;

import com.SearchAlgo.Search;
import com.sortingAlgorithms.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SearchTest {

    Search search = new Search();
    int[] a = {3, 5, 5, 8, 9, 10};


    @Test public void TestLinearSearch() {
        int result = search.LinearSearch(a, 9);
        assertEquals(4, result );

    }

    @Test public void TestBinarySearchRecursive() {
        Arrays.sort(a);
        int result = search.binarySearchRecu(a, 10);
        assertEquals(a.length-1, result);
    }

    @Test public void TestBinarySearchIterative() {
        Arrays.sort(a);
        int result = search.binarySearch(a, 10);
        assertEquals(a.length-1, result);
    }

    @Test public void TestTernarySearchIterative() {
        Arrays.sort(a);
        int result = search.ternarySearch(a, 9);
        assertEquals(3, result);
    }

}
