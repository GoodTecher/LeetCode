/**
 * GoodTecher LeetCode 26. Remove Duplicates from Sorted Array
 *
 * http://www.goodtecher.com/leetcode-26-remove-duplicates-from-sorted-array/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int i = 0;

    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }

    return i + 1;
    // Time Complextiy: O(n)
    // Space Complexity: O(1)
  }
}