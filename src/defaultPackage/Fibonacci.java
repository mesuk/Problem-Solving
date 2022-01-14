package defaultPackage;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciLoop(6);
    }

    public static void printFibonacciLoop(int n){
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber);
        System.out.print(" "+secondNumber);
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.print(" "+sum);
        }
    }
}
