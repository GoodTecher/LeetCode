/**
 * GoodTecher LeetCode 144. Binary Tree Preorder
 *
 * http://www.goodtecher.com/leetcode-144-binary-tree-preorder-traversal-java/
 *
 * www.goodtecher.com
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
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    if (root == null) {
      return result;
    }

    stack.push(root);
    while (!stack.empty()) {
      TreeNode node = stack.pop();
      result.add(node.val);

      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }

    return result;
  }
}