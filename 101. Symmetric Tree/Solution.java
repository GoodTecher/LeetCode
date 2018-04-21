/**
 * GoodTecher LeetCode Tutorial 104. Maximum Depth of Binary Tree
 *
 * http://www.goodtecher.com/leetcode-104-maximum-depth-of-binary-tree/
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
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    int maxDepth = Math.max(leftDepth, rightDepth) + 1;
    return maxDepth;
  }
}