/**
 * GoodTecher LeetCode Tutorial 35. Search Insert Position
 *
 * http://www.goodtecher.com/leetcode-35-search-insert-position-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


class Solution {

  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        start = mid;
      } else {
        end = mid;
      }
    }

    if (nums[end] < target) {
      return end + 1;
    } else if (nums[start] >= target) {
      return start;
    } else {
      return end;
    }

  }
}