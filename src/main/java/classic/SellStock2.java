package classic;

/**
 * Created by parkey19 on 2019. 2. 21..
 */
public class SellStock2 {
    public static void main(String[] args) {
//        int[] prices = {7,5,4};
//        int[] prices = {1,2,3,4,5};
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int profit = 0;
        int j = 1;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] > prices[i+j]) {
                continue;
            }
            for (int k = i+j; k < prices.length; k++) {
                if (prices[k] == prices[i]+k) {
                    buy = prices[i];
                    sell = prices[k];
                } else if(prices[k-1] < prices[k]) {
                    profit = prices[k] - prices[i];
                }
            }
            break;
        }
        profit = sell-buy;
        return profit;
    }
}
