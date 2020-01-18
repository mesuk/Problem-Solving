package evenOdd;

import java.util.ArrayList;
import java.util.List;

public class EvenOddMain {

    public static void main(String[] args) {

        int [] values={1,2,6,4,14,6,7,8,9,10};

        List<Integer>  evenList=new ArrayList<>();
        List<Integer>  oddList=new ArrayList<>();

        for (int i = 0; i < values.length; i++) {

            if(values[i]%2==0){
                evenList.add(values[i]);
            }else{
                oddList.add(values[i]);
            }
        }

        System.out.println("Even list :");

        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(" "+evenList.get(i));
        }

        System.out.println("Odd list :");


        for (int i = 0; i < oddList.size(); i++) {
            System.out.print(" "+oddList.get(i));
        }

    }
}
