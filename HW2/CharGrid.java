package oop.HW2;

public class CharGrid {
    private char[][] grid;

    /**
     * constructor with input arr.
     *
     * @param grid char arr
     */
    public CharGrid(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        this.grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.grid[i][j] = grid[i][j];
            }
        }
    }

    /**
     * find the area.
     *
     * @param ch char to find
     * @return int area
     */
    public int charArea(char ch) {
        int minRow = Integer.MAX_VALUE;
        int maxRow = -1;
        int minCol = Integer.MAX_VALUE;
        int maxCol = -1;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    if (minRow > i) {
                        minRow = i;
                    }
                    if (maxRow < i) {
                        maxRow = i;
                    }
                    if (minCol > j) {
                        minCol = j;
                    }
                    if (maxCol < j) {
                        maxCol = j;
                    }
                }
            }
        }
        if (maxRow == -1) {
            return 0;
        }
        int length = maxRow - minRow + 1;
        int height = maxCol - minCol + 1;
        return length * height;
    }

    /**
     * find number of plus.
     *
     * @return int
     */
    public int countPlus() {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int up = 1;
                int down = 1;
                int left = 1;
                int right = 1;
                //up
                for (int k = i - 1; k >= 0 && j < grid[k].length && grid[k][j] == grid[i][j]; k--) {
                    up++;
                }
                //down
                for (int k = i + 1; k < grid.length && j < grid[k].length && grid[k][j] == grid[i][j]; k++) {
                    down++;
                }
                //left
                for (int k = j - 1; k >= 0 && grid[i][k] == grid[i][j]; k--) {
                    left++;
                }
                //right
                for (int k = j + 1; k < grid[i].length && grid[i][k] == grid[i][j]; k++) {
                    right++;
                }
                int len = Math.min(Math.min(up, down), Math.min(left, right));
                if (len >= 2 && up == len && down == len && left == len && right == len) {
                    count++;
                }
            }
        }
        return count;
    }
}
