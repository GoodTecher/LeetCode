/**
 * GoodTecher LeetCode Tutorial 69. Sqrt(x)
 *
 * http://www.goodtecher.com/leetcode-69-sqrtx-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int mySqrt(int x) {
    long start = 0;
    long end = x;

    while (start + 1 < end) {
      long mid = start + (end - start) / 2;
      if (mid * mid == x) {
        return (int)mid;
      } else if (mid * mid < x) {
        start = mid;
      } else {
        end = mid;
      }
    }

    if (end * end == x) {
      return (int)end;
    }
    return (int)start;
  }
}