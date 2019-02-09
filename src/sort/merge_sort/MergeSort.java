package sort.merge_sort;

import sort.ISort;

public class MergeSort implements ISort {
    public MergeSort(boolean showData) {

    }

    @Override
    public Integer[] sort(Integer[] dataSet) {
         mergeSort(dataSet,0,dataSet.length-1);
        return dataSet;
    }

    void mergeSort(Integer Arr[], int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
    }

    void merge(Integer Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid+1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i <= mid && j <= end) {
            if(Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = Arr[j];
                k += 1; j += 1;
            }
        }

        // add elements left in the first interval
        while(i <= mid) {
            temp[k] = Arr[i];
            k += 1; i += 1;
        }

        // add elements left in the second interval
        while(j <= end) {
            temp[k] = Arr[j];
            k += 1; j += 1;
        }

        // copy temp to original interval
        for(i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }
}
