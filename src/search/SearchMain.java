package search;

import java.util.Random;

public class SearchMain {
    static final Integer DATA_SET_LENGTH =50000;
    static final Integer DATA_RANGE =1000;

    public static void main(String[] args) {

        Integer[] dataSet = generateDataSet();
        boolean showData=false;

        Integer keyWord=new Random().nextInt()%DATA_RANGE;

        long startTime=System.currentTimeMillis();
        ISearch mySearch = new BinarySearch(showData);
//        ISearch mySearch = new LinearSearch(showData);
        Boolean isDataFound=mySearch.search(dataSet,keyWord);

        System.out.println();
        System.out.println("Time Taken : "+(System.currentTimeMillis()-startTime)+" ms");
        System.out.println("isDataFound :"+isDataFound);

    }

    private static Integer[] generateDataSet() {
        Integer [] dataSet=new Integer[DATA_SET_LENGTH];

        for (Integer i = 0; i < DATA_SET_LENGTH; i++) {
            dataSet[i]=new Random().nextInt()%DATA_RANGE;
        }
        return dataSet;
    }


}
