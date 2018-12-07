package quick_sort;

public class QuickSortMain {

    public static void main(String[] args) {
        QuickSortFresh sorter = new QuickSortFresh();
        int[] input = {5,1,3,4,2};
        sorter.sort(input);

        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }



}
