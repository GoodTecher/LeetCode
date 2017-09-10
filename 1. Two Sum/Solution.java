/**
 * GoodTecher LeetCode Tutorial 1. Two Sum
 *
 * http://www.goodtecher.com/leetcode-1-two-sum-java/
 *
 * www.goodtecher.com
 */


public class Solution {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    Map<Integer, Integer> visited = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (visited.containsKey(target - nums[i])) {
        result[0] = visited.get(target - nums[i]);
        result[1] = i;
        return result;
      }
      visited.put(nums[i], i);
    }

    return result;
  }
}