package leetCode;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public static void main(String[] args) {
//https://leetcode.com/problems/coin-change/

//        int[] coins = {1, 2, 5};
//        int amount = 11; output : 3

        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return -1;
        }
        int count = 0;
        Integer[] nums = new Integer[coins.length];
        for (int i = 0; i < coins.length; i++) {
            nums[i] = coins[i];
        }
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.println();
            System.out.println("Amount :" + amount);
            System.out.println("Number :" + nums[i]);
            System.out.println("Count :" + count);
            if ((amount / nums[i]) > 0) {
                count += (amount / nums[i]);
            }
            amount = (amount % nums[i]);
        }
        System.out.println("FINALLY : Amount :" + amount);
        System.out.println("FINALLY : COUNT :" + count);
        return amount > 0 ? -1 : count;
    }
}
