/**
 * GoodTecher LeetCode Tutorial 62. Unique Paths
 *
 * http://www.goodtecher.com/leetcode-62-unique-paths/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {

  public int uniquePaths(int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }

    int[][] numberOfPaths = new int[m][n];

    for (int i = 0; i < m; i++) {
      numberOfPaths[i][0] = 1;
    }

    for (int j = 0; j < n; j++) {
      numberOfPaths[0][j] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        numberOfPaths[i][j] = numberOfPaths[i - 1][j] + numberOfPaths[i][j - 1];
      }
    }

    return numberOfPaths[m - 1][n - 1];

    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)
  }
}