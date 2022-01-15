package leetCode;

public class BinarySearch704 {
    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }
}
