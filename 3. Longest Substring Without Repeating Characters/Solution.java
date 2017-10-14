/**
 * GoodTecher LeetCode Tutorial 3. Longest Substring Without Repeating Characters
 *
 * http://www.goodtecher.com/leetcode-3-longest-substring-without-repeating-characters-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    HashSet<Character> set = new HashSet<>();

    int i = 0;
    int j = 0;
    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j));
        j++;
        maxLength = Math.max(maxLength, j - i);
      } else {
        set.remove(s.charAt(i));
        i++;
      }
    }
    return maxLength;
  }
}