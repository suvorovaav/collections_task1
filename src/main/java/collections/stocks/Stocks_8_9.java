package collections.stocks;

/**
 * 1) You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * 2)You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 */

public class Stocks_8_9 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitBuyAndSell(prices));
    }

    public static int maxProfit(int[] prices) {
        int minCost = prices[0];
        int diff = 0;
        for (int i=1; i<prices.length; i++){
            if (minCost>prices[i]){
                minCost = prices[i];
            }
            if (diff<prices[i]-minCost){
                diff = prices[i]-minCost;
            }
        }
        return diff;
    }

    public static int maxProfitBuyAndSell(int[] prices) {
        int buy;
        int sell;
        int maxProfit = 0;

        for (int i=0; i<prices.length-1; i++){
            buy = prices[i];
            sell = prices[i+1];
            maxProfit = Math.max(maxProfit, maxProfit+(sell-buy));
        }
        return maxProfit;
    }
}
