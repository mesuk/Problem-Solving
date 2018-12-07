package sort;

public class BubbleSort implements ISort {
    private boolean isLogEnabled;

    public BubbleSort(boolean isLogEnabled) {
        System.out.println("Start Bubble Sort ");
        this.isLogEnabled=isLogEnabled;
    }

    @Override
    public Integer[] sort(Integer[] dataSet) {
        int n = dataSet.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(dataSet[j-1] > dataSet[j]){
                    //swap elements
                    temp = dataSet[j-1];
                    dataSet[j-1] = dataSet[j];
                    dataSet[j] = temp;
                }

            }
        }

        System.out.println("End Bubble Sort ");

        return dataSet;
    }

    private void printLog(String logData){
        if(isLogEnabled){
            System.out.println(logData);
        }
    }

}
