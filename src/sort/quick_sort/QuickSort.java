package sort.quick_sort;

import sort.ISort;

public class QuickSort implements ISort {


    public QuickSort(boolean isLogEnabled) {
    }

    @Override
    public Integer[] sort(Integer[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return inputArr;
        }
        sort(inputArr, 0, inputArr.length - 1);
        return inputArr;

    }

    private void sort(Integer arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private int partition(Integer arr[], int low, int high) {
        int pivot = arr[high];
        int pIndex = low; // index of smaller element
        for (int j = low; j <= high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                // swap arr[i] and arr[j]
                int temp = arr[pIndex];
                arr[pIndex] = arr[j];
                arr[j] = temp;
                pIndex++;
            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = temp;

        return pIndex;
    }

}
