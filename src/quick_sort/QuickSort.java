package quick_sort;

public class QuickSort {

    private int[] array;
    private int length;

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        System.out.println("******* Sorting  **********");

        for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[(lowerIndex + (higherIndex - lowerIndex) / 2)];
        System.out.println();

        System.out.println("lowerIndex :"+lowerIndex+" higherIndex :"+higherIndex+" pivot :"+pivot);

        while (i <= j) {

            System.out.println();
            System.out.println("Looping : i="+i+" J="+j);

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            System.out.println("Now  : i="+i+" J="+j);

            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        System.out.println();
        System.out.println("Partitioning : I="+i+" J="+j);

        System.out.println();

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }

        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }


    }

    private void exchangeNumbers(int leftNumber, int rightNumber) {
        System.out.println("Exchange Index : "+leftNumber+" <> "+rightNumber);
        System.out.println("Exchanging : "+array[leftNumber]+" <> "+array[rightNumber]);
        int temp = array[leftNumber];
        array[leftNumber] = array[rightNumber];
        array[rightNumber] = temp;
    }


}
