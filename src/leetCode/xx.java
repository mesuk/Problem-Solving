package leetCode;

public class xx {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

        // 1,2,3,4,4
    }

    public static int searchInsert(int[] nums, int target) {
        int mid;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
