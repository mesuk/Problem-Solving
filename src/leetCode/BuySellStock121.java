package leetCode;

public class BuySellStock121 {

    // 121. Best Time to Buy and Sell Stock
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = 1;
        int pL, pR;
        while (r < prices.length) {
            pL = prices[l];
            pR = prices[r];
            // if buy value > sell then just update left to right pointer
            if (pL > pR) {
                l = r;
            } else {
                // update maxProfit, because sell value > buy value
                maxProfit = Math.max(maxProfit, (pR - pL));
            }
            // always update right pointer
            r++;
        }
        return maxProfit;
    }

    public static int maxProfitNSquire(int[] prices) {
        int maxProfit = 0;
        int pI, pJ;
        // this solution also valid, passes 199 test cases.
        // Time Limit Exceeded
        for (int i = 0; i < prices.length - 1; i++) {
            pI = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                pJ = prices[j];
                if (pI < pJ) {
                    maxProfit = Math.max(maxProfit, pJ - pI);
                }
            }

        }
        return maxProfit;
    }
}
