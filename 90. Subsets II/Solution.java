/**
 * GoodTecher LeetCode Tutorial 90. Subsets II
 *
 * http://www.goodtecher.com/leetcode-90-subsets-ii-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();

    if (nums == null || nums.length == 0) {
      return results;
    }

    Arrays.sort(nums);

    List<Integer> subset = new ArrayList<>();
    toFindAllSubsets(nums, results, subset, 0);

    return results;
  }

  private void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex) {
    results.add(new ArrayList<>(subset));

    for (int i = startIndex; i < nums.length; i++) {
      if (i != startIndex && nums[i] == nums[i - 1]) {
        continue;
      }

      subset.add(nums[i]);
      toFindAllSubsets(nums, results, subset, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}