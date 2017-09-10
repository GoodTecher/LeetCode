/**
 * GoodTecher LeetCode Tutorial 121. Best Time to Buy and Sell Stock
 *
 * http://www.goodtecher.com/leetcode-121-best-time-buy-sell-stock-java/
 *
 * www.goodtecher.com
 */


public class Solution {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }
    return maxProfit;
  }
}