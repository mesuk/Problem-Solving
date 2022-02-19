package leetCode;

public class FirstBadVersion {
    //https://leetcode.com/problems/first-bad-version/

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int mid;
        int l = 0, h = n;

        while (l <= h) {
            mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean isBadVersion(int mid) {
        return false;
    }
}
