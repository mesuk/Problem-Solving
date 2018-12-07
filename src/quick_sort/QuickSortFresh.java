package quick_sort;

public class QuickSortFresh {

    private int[] array;

    public void sort(int[] array){
        if(array==null || array.length==0){
            return;
        }
        this.array=array;

        quickSort(0,array.length-1);
    }

    private void quickSort(int leftIndex,int rightIndex){

        int i=leftIndex;
        int j=rightIndex;

        int pivot=array[(leftIndex+(rightIndex-leftIndex)/2)];

        while (i<=j){

            while (array[i]<pivot){
                i++;
            }

            while (array[j]>pivot){
                j--;
            }

            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }

        if(leftIndex<j){
            quickSort(leftIndex,j);
        }

        if(rightIndex>i){
            quickSort(i,rightIndex);
        }
    }

    private void swap(int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
