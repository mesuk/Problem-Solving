package sort;

public class QuickSort implements ISort {

    private Integer[] array;
    private Integer length;
    private boolean isLogEnabled;

    public QuickSort(boolean isLogEnabled) {
        System.out.println("Start Quick Sort ");
        this.isLogEnabled=isLogEnabled;
    }

    @Override
    public Integer[] sort(Integer[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return inputArr;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        System.out.println("End Quick Sort ");
        return array;

    }

    private void quickSort(Integer lowerIndex, Integer higherIndex) {

        printLog("******* Sorting  **********");

        if(isLogEnabled) {
            for (Integer i : array) {
                System.out.print("" + i);
                System.out.print(" ");
            }
        }

        Integer i = lowerIndex;
        Integer j = higherIndex;

        Integer pivot = array[(lowerIndex + (higherIndex - lowerIndex) / 2)];
        printLog("");

        printLog("lowerIndex :"+lowerIndex+" higherIndex :"+higherIndex+" pivot :"+pivot);

        while (i <= j) {


                printLog("");
                printLog("Looping : i="+i+" J="+j);


            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            printLog("Now  : i="+i+" J="+j);

            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        printLog("");
        printLog("Partitioning : I="+i+" J="+j);

        printLog("");

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }

        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }


    }

    private void exchangeNumbers(Integer leftIndex, Integer rightIndex) {
        printLog("Exchange Index : "+leftIndex+" <> "+rightIndex);
        printLog("Exchanging : "+array[leftIndex]+" <> "+array[rightIndex]);
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    private void printLog(String logData){
        if(isLogEnabled){
            System.out.println(logData);
        }
    }


}
