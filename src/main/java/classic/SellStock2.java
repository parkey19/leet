package classic;

/**
 * Created by parkey19 on 2019. 2. 21..
 */
public class SellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,5,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int profit = 0;
        int j = 1;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] > prices[j+i]) {
                continue;
            }

        }
        return profit;
    }
}
