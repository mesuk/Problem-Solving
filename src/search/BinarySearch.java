package search;

import sort.ISort;
import sort.quick_sort.QuickSort;

public class BinarySearch implements ISearch {

    private boolean isLogEnabled;

    public BinarySearch(boolean isLogEnabled) {
        System.out.println("Start Binary Search ");
        this.isLogEnabled = isLogEnabled;
    }

    @Override
    public boolean search(Integer[] dataSet, Integer keyWord) {

        long startTime = System.currentTimeMillis();

        ISort iSort = new QuickSort(false);
//        ISort iSort=new BubbleSort(false);
        dataSet = iSort.sort(dataSet);
        System.out.println("Sorting Time : " + (System.currentTimeMillis() - startTime) + " ms");

        printLog("******* Searching  **********");
        System.out.println(" KeyWord :" + keyWord);

        if (isLogEnabled) {
            for (Integer i : dataSet) {
                System.out.print("" + i);
                System.out.print(" ");
            }
        }

        Integer start = 0;
        Integer end = dataSet.length - 1;

        if (dataSet.length <= 0) {
            return false;
        }

        boolean isDataFound = false;

        while (start <= end) {

            printLog("start :" + start + " End :" + end);
            Integer middle = (end + start) / 2;

            printLog("Middle :" + middle);

            if (keyWord < dataSet[middle]) {
                end = middle - 1;
            } else if (keyWord > dataSet[middle]) {
                start = middle + 1;
            } else {
                printLog("Data :" + dataSet[middle]);
                isDataFound = true;
                break;
            }
        }

        System.out.println("End Binary Search ");

        return isDataFound;
    }

    private void printLog(String logData) {
        if (isLogEnabled) {
            System.out.println(logData);
        }
    }
}
