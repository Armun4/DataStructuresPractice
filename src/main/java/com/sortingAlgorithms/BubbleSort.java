package com.sortingAlgorithms;

public class BubbleSort {
    public void sort(int[] items) {
        boolean isSorted;
        for (int i = 0; i < items.length; i++) {
            isSorted = true;
            for (int j = 1; j < items.length - 1; j++) {
                if (items[j] < items[j - 1])
                    swap(items, j, j - 1);
                isSorted = false;
            }
        if (isSorted)
            return;
        }
    }
        private void swap ( int[] items, int i, int j){
            int temp = items[j];
            items[j] = items[i];
            items[i] = temp;
        }

}
