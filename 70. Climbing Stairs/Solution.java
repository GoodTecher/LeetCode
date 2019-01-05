/**
 * GoodTecher LeetCode Tutorial 70. Climbing Stairs
 *
 * http://www.goodtecher.com/leetcode-70-climbing-stairs/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int climbStairs(int n) {
    if (n <= 1) {
      return 1;
    }

    int[] ways = new int[n + 1];
    ways[0] = 1;
    ways[1] = 1;

    for (int i = 2; i <= n; i++) {
      ways[i] = ways[i - 2] + ways[i - 1];
    }

    return ways[n];
  }
}