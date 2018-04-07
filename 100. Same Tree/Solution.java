/**
 * GoodTecher LeetCode Tutorial 100. Same Tree
 *
 * http://www.goodtecher.com/leetcode-100-same-tree/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }

    if (p != null && q != null) {
      if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
        return true;
      }
    }

    return false;
  }
}