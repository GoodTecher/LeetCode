/**
 * GoodTecher LeetCode Tutorial 4. Median of Two Sorted Arrays
 *
 * http://www.goodtecher.com/leetcode-4-median-two-sorted-arrays/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int len = nums1.length + nums2.length;
    if (len % 2 == 1) {
      return findKth(nums1, 0, nums2, 0, len / 2 + 1);
    } else {
      return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
    }
  }

  public int findKth(int[] A, int startA, int[] B, int startB, int k) {
    if (startA >= A.length) {
      return B[startB + k - 1];
    }

    if (startB >= B.length) {
      return A[startA + k - 1];
    }

    if (k == 1) {
      return Math.min(A[startA], B[startB]);
    }

    int indexA = startA + k / 2 - 1;
    int indexB = startB + k / 2 - 1;
    int keyA = indexA < A.length ? A[indexA] : Integer.MAX_VALUE;
    int keyB = indexB < B.length ? B[indexB] : Integer.MAX_VALUE;

    if (keyA < keyB) {
      return findKth(A, startA + k / 2, B, startB, k - k / 2);
    } else {
      return findKth(A, startA, B, startB + k / 2, k - k / 2);
    }
  }
}