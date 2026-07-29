class Solution {
    public int islandPerimeter(int[][] grid) {
        int[][] map = new int[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, helper(grid, i, j, map));
            }
        }
        return max;
    }
    private int helper(int[][] grid, int i, int j, int[][] map) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        int val = 0;
        if (grid[i][j] == 1 && map[i][j] == 0) {
            map[i][j] = 1;
            val = helper(grid, i + 1, j, map) + helper(grid, i, j + 1, map) + helper(grid, i - 1, j, map) + helper(grid, i, j - 1, map);
        }
        
        return val;
    }
}