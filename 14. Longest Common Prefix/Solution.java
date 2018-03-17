/**
 * GoodTecher LeetCode Tutorial 14. Longest Common Prefix
 *
 * http://www.goodtecher.com/leetcode-14-longest-common-prefix/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String longestCommonPrefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      int j = 0;
      String currentString = strs[i];

      while (j < longestCommonPrefix.length() && j < currentString.length() && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
        j++;
      }

      if (j == 0) {
        return "";
      }

      longestCommonPrefix = longestCommonPrefix.substring(0, j);
    }

    return longestCommonPrefix;
  }
}