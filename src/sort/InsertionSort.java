package sort;

public class InsertionSort implements ISort {


    public InsertionSort(boolean showData) {

    }

    @Override
    public Integer[] sort(Integer[] dataSet) {

        for (int i = 1; i < dataSet.length; i++) {
            Integer value=dataSet[i];
            Integer hole=i;

            while (hole>0 && dataSet[hole-1]>value){
                dataSet[hole]=dataSet[hole-1];
                hole--;
            }

            dataSet[hole]=value;
        }

        return dataSet;
    }
}
