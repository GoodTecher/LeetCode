/**
 * GoodTecher LeetCode Tutorial 5. Longest Palindromic Substring
 *
 * http://www.goodtecher.com/leetcode-5-longest-palindromic-substring/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.length() < 2) {
      return s;
    }

    int length = s.length();

    boolean[][] isPalindrome = new boolean[length][length];

    int left = 0;
    int right = 0;

    for (int j = 1; j < length; j++) {
      for (int i = 0; i < j; i++) {
        boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;

        if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
          isPalindrome[i][j] = true;

          if (j - i > right - left) {
            left = i;
            right = j;
          }
        }
      }
    }

    return s.substring(left, right + 1);

    // Time Complexity: O(n ^ 2)
    // Space Complexity: O(n ^ 2)
  }
}