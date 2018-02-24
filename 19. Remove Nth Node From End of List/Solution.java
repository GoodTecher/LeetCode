/**
 * GoodTecher LeetCode Tutorial 19. Remove Nth Node From End of List
 *
 * http://www.goodtecher.com/leetcode-19-remove-nth-node-end-list/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (n <= 0) {
      return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode preDelete = dummy;

    for (int i = 0; i < n; i++) {
      if (head == null) {
        return null;
      }
      head = head.next;
    }

    while (head != null) {
      preDelete = preDelete.next;
      head = head.next;
    }

    preDelete.next = preDelete.next.next;

    return dummy.next;
  }
}