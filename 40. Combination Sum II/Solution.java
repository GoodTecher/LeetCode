/**
 * GoodTecher LeetCode 40. Combination Sum II
 *
 * http://www.goodtecher.com/leetcode-40-combination-sum-ii-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();

    if (candidates == null || candidates.length == 0) {
      return results;
    }

    Arrays.sort(candidates);

    List<Integer> combination = new ArrayList<>();
    toFindCombinationsToTarget(candidates, results, combination, 0, target);

    return results;
  }

  private void toFindCombinationsToTarget(int[] candidates, List<List<Integer>> results, List<Integer> combination, int startIndex, int target) {
    if (target == 0) {
      results.add(new ArrayList<>(combination));
      return;
    }

    for (int i = startIndex; i < candidates.length; i++) {
      if (i != startIndex && candidates[i] == candidates[i - 1]) {
        continue;
      }

      if (candidates[i] > target) {
        break;
      }

      combination.add(candidates[i]);
      toFindCombinationsToTarget(candidates, results, combination, i + 1, target - candidates[i]);
      combination.remove(combination.size() - 1);
    }

  }
}