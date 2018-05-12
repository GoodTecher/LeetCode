/**
 * GoodTecher LeetCode Tutorial 102. Binary Tree Level Order Traversal
 *
 * http://www.goodtecher.com/leetcode-102-binary-tree-level-order-traversal/
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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> level = new ArrayList<>();

      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        level.add(node.val);

        if (node.left != null) {
          queue.offer(node.left);
        }

        if (node.right != null) {
          queue.offer(node.right);
        }
      }

      result.add(level);
    }

    return result;
  }
}