/**
 * GoodTecher LeetCode Tutorial 16. 3Sum Closest
 *
 * http://www.goodtecher.com/leetcode-16-3sum-closest/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    if (nums == null || nums.length < 3) {
      return -1;
    }

    Arrays.sort(nums);

    int closetSum = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (Math.abs(sum - target) < Math.abs(closetSum - target)) {
          closetSum = sum;
        }

        if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }

    return closetSum;
  }
}