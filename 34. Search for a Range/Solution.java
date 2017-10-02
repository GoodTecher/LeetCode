/**
 * GoodTecher LeetCode Tutorial 34. Search for a Range
 *
 * http://www.goodtecher.com/leetcode-34-search-range-java/
 *
 * www.goodtecher.com
 */

class Solution {
  public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = -1;
    result[1] = -1;

    if (nums == null || nums.length == 0) {
      return result;
    }

    // first binary search to find the first occurence of the target
    int start = 0;
    int end = nums.length - 1;

    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        end = mid;
      } else if (nums[mid] > target) {
        end = mid;
      } else {
        start = mid;
      }
    }

    if (nums[end] == target) {
      result[0] = end;
    }
    if (nums[start] == target) {
      result[0] = start;
    }

    // second binary search to find the last occurence of the target
    start = 0;
    end = nums.length - 1;

    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        start = mid;
      } else if (nums[mid] < target) {
        start = mid;
      } else {
        end = mid;
      }
    }

    if (nums[start] == target) {
      result[1] = start;
    }
    if (nums[end] == target) {
      result[1] = end;
    }

    return result;
  }
}