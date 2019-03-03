package leetCode;

public class LeetCodeProblems {

    //504. Base 7
    public String baseConversion(int num){

        int base=7;
        if(num==0){
            return ""+0;
        }

        boolean isNegativeNumber=(num<0);

        if(isNegativeNumber){
            num=num*(-1);
        }

        StringBuilder stringBuilder=new StringBuilder("");

        while (num>=base){
            int reminder=num%base;
            stringBuilder.append(reminder);
            num=num/base;
        }
        stringBuilder.append(num);

        if(isNegativeNumber){
            stringBuilder.append("-");
        }

        String convertedNumber=stringBuilder.reverse().toString();

        return convertedNumber;
    }
}
