package leetCode;

public class FindPeakElement {

    public static void main(String[] args) {
        //https://leetcode.com/problems/find-peak-element/
        int[] nums = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {

        int l = 0;
        int h = nums.length - 1;
        int mid;

        while (l < h) {
            mid = l + (h - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
