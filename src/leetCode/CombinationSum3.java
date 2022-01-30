package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/combination-sum-iii/

        int k = 3, n = 7;

        List<List<Integer>> result = combinationSum3(k, n);
        System.out.println(result);

    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new LinkedList<>(), result);
        return result;
    }

    public static void backtrack(int start, int k, int n,
                                 LinkedList<Integer> ll,
                                 List<List<Integer>> results) {
        printCombinations(ll);

        if (k < 0 || n < 0) {
            return;
        } else if (k == 0 && n == 0) {
            results.add(new ArrayList<>(ll));
            return;
        }
        for (int i = start; i <= 9; i++) {
            ll.add(i);
            backtrack(i + 1, k - 1, n - i, ll, results);
            ll.removeLast();
        }
    }

    private static void printCombinations(LinkedList<Integer> ll) {
        if (ll == null) {
            return;
        }

        System.out.println(new ArrayList<>(ll));
    }
}
