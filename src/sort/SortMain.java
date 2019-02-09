package sort;

import sort.merge_sort.MergeSort;

import java.util.Random;

public class SortMain {
    static final Integer DATA_SET_LENGTH =10;

    public static void main(String[] args) {

        Integer[] dataSet = generateDataSet();
        boolean showData=true;

        long startTime=System.currentTimeMillis();
        ISort mySort = new MergeSort(showData);
        dataSet=mySort.sort(dataSet);

        System.out.println("Time Taken : "+(System.currentTimeMillis()-startTime)+" ms");

        if(showData){

            for (Integer integer:dataSet) {
                System.out.print(""+integer);
                System.out.print(" ");
            }

        }

    }

    private static Integer[] generateDataSet() {


        Integer [] dataSet=new Integer[DATA_SET_LENGTH];

        for (Integer i = 0; i < DATA_SET_LENGTH; i++) {
            dataSet[i]=new Random().nextInt()%100;
        }
        return dataSet;
    }


}
