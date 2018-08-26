/**
 * GoodTecher LeetCode Tutorial 387. First Unique Character in a String
 *
 * http://www.goodtecher.com/leetcode-387-first-unique-character-in-a-string/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


class Solution {
  public int firstUniqChar(String s) {
    if (s == null || s.length() == 0) {
      return -1;
    }

    int[] charCounts = new int[26];

    for (int i = 0; i < s.length(); i++) {
      charCounts[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s.length(); i++) {
      if (charCounts[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }

    return -1;
  }
}