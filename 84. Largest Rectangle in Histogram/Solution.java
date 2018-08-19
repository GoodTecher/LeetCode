/**
 * GoodTecher LeetCode Tutorial 84. Largest Rectangle in Histogram
 *
 * http://www.goodtecher.com/leetcode-84-largest-rectangle-in-histogram/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


class Solution {
  public int largestRectangleArea(int[] heights) {
    if (heights == null || heights.length == 0) {
      return 0;
    }

    int maxArea = 0;
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);

    for (int i = 0; i < heights.length; i++) {
      int currentBarHeight = heights[i];

      while (stack.peek() != -1 && currentBarHeight <= heights[stack.peek()]) {
        int height = heights[stack.pop()];
        int width = i - stack.peek() - 1;

        int area = height * width;
        maxArea = Math.max(area, maxArea);
      }

      stack.push(i);
    }

    while (stack.peek() != -1) {
      int height = heights[stack.pop()];
      int width = heights.length - stack.peek() - 1;

      int area = height * width;
      maxArea = Math.max(area, maxArea);
    }

    return maxArea;

    // Time complexity : O(n). n numbers are pushed and popped.
    // Space complexity : O(n). Stack is used.
  }
}