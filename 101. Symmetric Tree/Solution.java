/**
 * GoodTecher LeetCode Tutorial 101. Symmetric Tree
 *
 * http://www.goodtecher.com/leetcode-101-symmetric-tree/
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
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    return isMirror(root.left, root.right);
  }

  private boolean isMirror(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }

    if (node1 == null || node2 == null) {
      return false;
    }

    if (node1.val != node2.val) {
      return false;
    }

    return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
  }
}