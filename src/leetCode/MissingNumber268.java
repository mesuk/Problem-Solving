package leetCode;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        // number size is : length of array. One number is missing
        // sum = n*(n-1)/2
        // missing number = sum- existing number sum
        int sum = 0;
        for (Integer item : nums
        ) {
            sum += item;
        }

        int n = nums.length + 1;
        return (n * (n - 1) / 2) - sum;
    }
}
