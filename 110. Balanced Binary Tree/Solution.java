/**
 * GoodTecher LeetCode Tutorial 110. Balanced Binary Tree
 *
 * http://www.goodtecher.com/leetcode-110-balanced-binary-tree/
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
  public boolean isBalanced(TreeNode root) {
    return maxDepth(root) != null;
  }

  private Integer maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    Integer leftDepth = maxDepth(root.left);
    Integer rightDepth = maxDepth(root.right);

    if (leftDepth == null || rightDepth == null) {
      return null;
    }

    if (Math.abs(leftDepth - rightDepth) > 1) {
      return null;
    }

    return Math.max(leftDepth, rightDepth) + 1;
  }
}