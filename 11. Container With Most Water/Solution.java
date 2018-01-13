/**
 * GoodTecher LeetCode Tutorial 11. Container With Most Water
 *
 * http://www.goodtecher.com/leetcode-11-container-water-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;

    if (height == null) {
      return maxArea;
    }

    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int area = (right - left) * Math.min(height[left], height[right]);
      maxArea = Math.max(maxArea, area);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return maxArea;

    // Time Complexity : O(n)
    // Space Complexity : O(1)
  }
}