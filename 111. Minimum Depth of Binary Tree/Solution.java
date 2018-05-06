/**
 * GoodTecher LeetCode Tutorial 111. Minimum Depth of Binary Tree
 *
 * http://www.goodtecher.com/leetcode-111-minimum-depth-of-binary-tree/
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
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    return findMinDepth(root);
  }

  private int findMinDepth(TreeNode root) {
    if (root == null) {
      return Integer.MAX_VALUE;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    return Math.min(findMinDepth(root.left), findMinDepth(root.right)) + 1;
  }
}