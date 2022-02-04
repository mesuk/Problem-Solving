package leetCode;

public class SearchRotatedArray {
    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{4, 4, 5, 6, 7, 1, 2, 3};
//        int[] nums = new int[]{1, 3};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        int ascendingStart = findRotateIndex(nums);

        // if target is the smallest element
        if (nums[ascendingStart] == target)
            return ascendingStart;
        // if array is not rotated, search in the entire array
        if (ascendingStart == 0)
            return search(nums, target, 0, nums.length - 1);
        if (target < nums[0])
            // search in the right side
            return search(nums, target, ascendingStart, nums.length - 1);
        // search in the left side
        return search(nums, target, 0, ascendingStart - 1);
    }

    public static int search(int[] nums, int target, int left, int right) {
    /*
    Binary search
    */
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] == target)
                return pivot;
            else {
                if (target < nums[pivot])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return -1;
    }

    private static int findRotateIndex(int[] nums) {

        int l = 0, h = nums.length - 1;
        int mid;

        while (l <= h) {
            mid = l + (h - l) / 2;
            if (mid + 1 < nums.length && nums[mid] > nums[mid + 1])
                return mid + 1;
            else {
                // update h based on PEAK selection criteria
                if (nums[mid] < nums[l])
                    h = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return 0;
    }
}
