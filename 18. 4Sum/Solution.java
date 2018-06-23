/**
 * GoodTecher LeetCode Tutorial 18. 4Sum
 *
 * http://www.goodtecher.com/leetcode-18-4sum/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 3; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j != i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }

        int left = j + 1;
        int right = nums.length - 1;

        while (left < right) {
          int sum = nums[i] + nums[j] + nums[left] + nums[right];

          if (sum < target) {
            left++;
          } else if (sum > target) {
            right--;
          } else {
            List<Integer> quadruplet = new ArrayList<>();
            quadruplet.add(nums[i]);
            quadruplet.add(nums[j]);
            quadruplet.add(nums[left]);
            quadruplet.add(nums[right]);

            result.add(quadruplet);

            left++;
            right--;

            while (left < right && nums[left] == nums[left - 1]) {
              left++;
            }

            while (left < right && nums[right] == nums[right + 1]) {
              right--;
            }
          }
        }
      }
    }

    return result;

    // Time Complexity: O(n^3)
    // Space Complexity: O(n^3)
  }
}