import java.util.Arrays;

public class Exam {
    //1c, 5c, 10c, 25c, 50c, $1


    public static void main(String[] args) {

        //        getChange(5, 0.99) // should return [1,0,0,0,0,4] [done]
        System.out.println(Arrays.toString(getChange(5, 0.99)));

        //getChange(3.14, 1.99) // should return [0,1,1,0,0,1]
        System.out.println(Arrays.toString(getChange(3.14, 1.99)));
//        getChange(3, 0.01) // should return [4,0,2,1,1,2]
        System.out.println(Arrays.toString(getChange(3, 0.01)));
//        getChange(4, 3.14) // should return [1,0,1,1,1,0]
        System.out.println(Arrays.toString(getChange(4, 3.14)));
//        getChange(0.45, 0.34) // should return [1,0,1,0,0,0]
        System.out.println(Arrays.toString(getChange(0.45, 0.34)));
    }

    public static int[] getChange(double M, double P) {
        M = M * 100;
//        1c, 5c, 10c, 25c, 50c, $1
        int[] values = {100, 50, 25, 10, 5, 1};

        int[] result = new int[values.length];

        M = M - (P * 100);
        int arrPosition = values.length - 1;
        for (int i = 0; i < values.length; i++) {
            if (M / values[i] > 0) {
                result[arrPosition--] = (int) M / values[i];
            }
            M = M % values[i];
            if (M <= 0) {
                break;
            }
        }

        return result;
    }
}
