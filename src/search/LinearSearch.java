package search;

public class LinearSearch implements ISearch {

    private boolean isLogEnabled;

    public LinearSearch(boolean isLogEnabled) {
        System.out.println("Start Linear Search ");
        this.isLogEnabled=isLogEnabled;
    }

    @Override
    public boolean search(Integer[] dataSet, Integer keyWord) {

        printLog("******* Searching  **********");
        System.out.println(" KeyWord :"+keyWord);
        if(isLogEnabled) {
            for (Integer i : dataSet) {
                System.out.print("" + i);
                System.out.print(" ");
            }
        }

        if(dataSet.length<=0){
            return false;
        }

        boolean isDataFound=false;
        for (Integer data:dataSet) {
            if(data==keyWord){
                System.out.println("Data Found :"+data);
                isDataFound=true;
                break;
            }
        }

        System.out.println("End Linear Search");
        return isDataFound;
    }

    private void printLog(String logData){
        if(isLogEnabled){
            System.out.println(logData);
        }
    }
}