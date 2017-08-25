/**
 * GoodTecher LeetCode Tutorial 2. Add Two Numbers
 *
 * http://www.goodtecher.com/leetcode-2-add-two-numbers-java/
 * www.goodtecher.com
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;

    while (l1 != null && l2 != null) {
      int result = (l1.val + l2.val + carry) % 10;
      ListNode newNode = new ListNode(result);
      carry = (l1.val + l2.val + carry) / 10;
      current.next = newNode;
      current = newNode;
      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {
      int result = (l1.val + carry) % 10;
      ListNode newNode = new ListNode(result);
      carry = (l1.val + carry) / 10;
      current.next = newNode;
      current = newNode;
      l1 = l1.next;
    }

    while (l2 != null) {
      int result = (l2.val + carry) % 10;
      ListNode newNode = new ListNode(result);
      carry = (l2.val + carry) / 10;
      current.next = newNode;
      current = newNode;
      l2 = l2.next;
    }

    if (carry != 0) {
      ListNode newNode = new ListNode(carry);
      current.next = newNode;
      current = newNode;
    }

    return dummy.next;
  }
}