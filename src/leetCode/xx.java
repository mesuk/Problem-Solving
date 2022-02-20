package leetCode;

public class xx {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = 1;
        int pL, pR;
        while (r < prices.length) {
            pL = prices[l];
            pR = prices[r];
            if (pL > pR) {
                l = r;
            } else {
                maxProfit = Math.max(maxProfit, (pR - pL));
            }
            r++;
        }
        return maxProfit;
    }

    public static int maxProfitNSquire(int[] prices) {
        int maxProfit = 0;
        int pI, pJ;
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
