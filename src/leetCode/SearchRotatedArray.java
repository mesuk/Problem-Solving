package leetCode;

public class SearchRotatedArray {
    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
//        int[] nums = new int[]{4, 4, 5, 6, 7, 1, 2, 3};
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{1, 3};
        int target = 3;
//        int target = 3;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        // 1. length ==1 and != target then retuen -1
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;

        // 2. Find roated index
        int rotateIndex = findRotateIndex(nums);

        // 3. if index == -1, false
        if (rotateIndex == -1) {
            return rotateIndex;
        }

        // 4. target == roated index then return roated index
        if (target == nums[rotateIndex]) {
            return rotateIndex;
        }

        // 5. rotateIndex == 0, data already sorted, search entire array
        if (rotateIndex == 0) {
            return search(nums, target, 0, nums.length - 1);
        } else if (target > nums[rotateIndex] && target < nums[0]) {
            // 6. target in first half
            return search(nums, target, rotateIndex, nums.length - 1);
        } else {
            // 7. target in second half
            return search(nums, target, 0, rotateIndex);
        }
    }

    // left is start, right is end, it is not length
    public static int search(int[] nums, int target, int left, int right) {
    /*
    Binary search
    */
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static int findRotateIndex(int[] nums) {

        int l = 0, h = nums.length - 1;
        int mid;

        if (nums.length == 0) {
            return -1;
        }

        if (nums[h] > nums[0]) {
            return 0;
        }

        while (l <= h) {
            mid = l + (h - l) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            if (nums[mid - 1] > nums[mid]) {
                return mid;
            }

            if (nums[mid] > nums[0]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}
