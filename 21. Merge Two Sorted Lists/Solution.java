/**
 * GoodTecher LeetCode Tutorial 21. Merge Two Sorted Lists
 *
 * http://www.goodtecher.com/leetcode-21-merge-two-sorted-lists-java/
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
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode l3 = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        l3.next = l1;
        l1 = l1.next;
      } else {
        l3.next = l2;
        l2 = l2.next;
      }
      l3 = l3.next;
    }

    if (l1 != null) {
      l3.next = l1;
    }

    if (l2 != null) {
      l3.next = l2;
    }

    return dummy.next;
  }
}