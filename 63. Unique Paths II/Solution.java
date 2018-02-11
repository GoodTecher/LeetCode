/**
 * GoodTecher LeetCode Tutorial 63. Unique Paths II
 *
 * http://www.goodtecher.com/leetcode-63-unique-paths-ii/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
      return 0;
    }

    int height = obstacleGrid.length;
    int width = obstacleGrid[0].length;

    int[][] paths = new int[height][width];

    // first column
    for (int i = 0; i < height; i++) {
      if (obstacleGrid[i][0] != 1) {
        paths[i][0] = 1;
      } else {
        break;
      }
    }

    // first row
    for (int j = 0; j < width; j++) {
      if (obstacleGrid[0][j] != 1) {
        paths[0][j] = 1;
      } else {
        break;
      }
    }

    // for spaces not at first row or first column
    for (int i = 1; i < height; i++) {
      for (int j = 1; j < width; j++) {
        if (obstacleGrid[i][j] != 1) {
          paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
        }
      }
    }

    return paths[height - 1][width - 1];
  }
}