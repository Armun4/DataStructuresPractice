package com.SearchAlgo;

public class Search {
    public int LinearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }


    public int binarySearchRecu(int[] a, int target) {

        return binarySearchRecu(a, target, 0, a.length);

    }
    private int binarySearchRecu(int[] a, int target, int left, int right) {

        if (right < left) return -1;

        int middle = (left + right) / 2;

        if (a[middle] == target)
            return middle;

        if (target < a[middle])
            return binarySearchRecu(a, target, left, middle - 1);

        return binarySearchRecu(a, target, middle + 1, right);
    }


    public int binarySearch(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (a[middle] == target)
                return middle;

            if (target < a[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    public int ternarySearch(int[]a, int target){
        return ternarySearch(a, target, 0, a.length)-1;
    }
    private int ternarySearch(int[] a, int target, int left, int right){

        if (left > right) return -1;
        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (a[mid1] == target)
            return mid1;
        if (a[mid2] == target)
            return mid2;

        if (target < a[mid1])
            return ternarySearch(a, target,left,mid1 -1);

        if (target > a[mid2])
            return ternarySearch(a, target,mid2 + 1, left);

        return ternarySearch(a, target, mid1+1, mid2 -1);

    }
}