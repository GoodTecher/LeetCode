/**
 * GoodTecher LeetCode Tutorial 138. Copy List with Random Pointer
 *
 * http://www.goodtecher.com/leetcode-138-copy-list-random-pointer/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */


/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */

public class Solution {
  public RandomListNode copyRandomList(RandomListNode head) {
    if (head == null) {
      return null;
    }

    Map<RandomListNode, RandomListNode> map = new HashMap<>();

    RandomListNode dummy = new RandomListNode(0);
    RandomListNode current = dummy;
    RandomListNode newNode = null;

    while (head != null) {
      if (map.containsKey(head)) {
        newNode = map.get(head);
      } else {
        newNode = new RandomListNode(head.label);
        map.put(head, newNode);
      }

      if (head.random != null) {
        if (map.containsKey(head.random)) {
          newNode.random = map.get(head.random);
        } else {
          newNode.random = new RandomListNode(head.random.label);
          map.put(head.random, newNode.random);
        }
      }

      current.next = newNode;
      current = newNode;
      head = head.next;
    }

    return dummy.next;
  }
}