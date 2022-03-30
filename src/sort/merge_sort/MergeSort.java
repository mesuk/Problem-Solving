package sort.merge_sort;

import sort.ISort;

public class MergeSort implements ISort {

    //https://www.geeksforgeeks.org/merge-sort/
    @Override
    public Integer[] sort(Integer[] dataSet) {
        mergeSort(dataSet, 0, dataSet.length - 1);
        return dataSet;
    }

    void mergeSort(Integer[] totalArray, int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(totalArray, l, mid);
            mergeSort(totalArray, mid + 1, r);
            merge(totalArray, l, mid, r);
        }
    }

    void merge(Integer[] totalArray, int l, int m, int r) {

        // Problem: Need an extra space, length n
        // create a new temp array
        int[] temp = new int[r - l + 1];

        // crawlers for both intervals and for temp
        int i = l, j = m + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= m && j <= r) {
            if (totalArray[i] <= totalArray[j]) {
                temp[k] = totalArray[i];
                i += 1;
            } else {
                temp[k] = totalArray[j];
                j += 1;
            }
            k += 1;
        }

        // add elements left in the first interval
        while (i <= m) {
            temp[k] = totalArray[i];
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= r) {
            temp[k] = totalArray[j];
            k += 1;
            j += 1;
        }
        // copy temp to original interval
        for (i = l; i <= r; i += 1) {
            totalArray[i] = temp[i - l];
        }
    }
}
