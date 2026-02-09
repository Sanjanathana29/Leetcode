class Solution {

    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        dp = new int[m][n];

        return dfs(obstacleGrid, 0, 0, m, n);
    }

    public int dfs(int[][] grid, int i, int j, int m, int n) {

        // ❌ Out of bounds
        if (i < 0 || j < 0 || i >= m || j >= n) return 0;

        // ❌ Obstacle
        if (grid[i][j] == 1) return 0;

        // 🎯 Reached destination
        if (i == m - 1 && j == n - 1) return 1;

        // 💾 Already computed
        if (dp[i][j] != 0) return dp[i][j];

        // 🎬 Move down and right
        int down = dfs(grid, i + 1, j, m, n);
        int right = dfs(grid, i, j + 1, m, n);

        dp[i][j] = down + right;
        return dp[i][j];
    }
}
