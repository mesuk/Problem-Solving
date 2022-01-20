package leetCode;

public class RemoveDuplicatesFromSortedArray80 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int frequencyCount = 0;
        int currentNumber = 0;
        int prevNumber = 0;
        int insertPosition = 0;

        for (int i = 1; i < nums.length; i++) {
            if (frequencyCount == 0) {
                currentNumber = nums[i];
            }

            if (nums[i] == currentNumber) {
                frequencyCount++;
                prevNumber = currentNumber;
            } else {
                int x= Math.min(frequencyCount, 2);
                for (int j = 0; j < x; j++) {
                    nums[insertPosition] = prevNumber;
                    insertPosition++;
                }
                frequencyCount = 0;
                prevNumber = nums[i];
            }
        }

        return insertPosition;

    }
}
