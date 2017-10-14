/**
 * GoodTecher LeetCode Tutorial 122. Best Time to Buy and Sell Stock II
 *
 * http://www.goodtecher.com/leetcode-122-best-time-buy-sell-stock-ii-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


public class Solution {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;

    if (prices.length <= 1) {
      return maxProfit;
    }

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        maxProfit += prices[i] - prices[i - 1];
      }
    }

    return maxProfit;
  }
}