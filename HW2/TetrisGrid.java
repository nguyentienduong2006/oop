package oop.HW2;

import java.util.Arrays;

public class TetrisGrid {
    private boolean[][] grid;
    private int width;
    private int height;

    /**
     * constructor with arr input.
     *
     * @param grid input arr
     */
    public TetrisGrid(boolean[][] grid) {
        this.width = grid.length;
        this.height = grid[0].length;
        this.grid = new boolean[this.width][this.height];
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                this.grid[i][j] = grid[i][j];
            }
        }
    }

    /**
     * delete the first row and create a new one at tail.
     *
     */
    public void clearRows() {
        for (int y = 0; y < this.height - 1; y++) {
            for (int x = 0; x < this.width; x++) {
                this.grid[x][y] = this.grid[x][y + 1];
            }
        }
        for (int x = 0; x < this.width; x++) {
            this.grid[x][height - 1] = false;
        }
    }

    /**
     * get the grid(table).
     *
     * @return grid as arr
     */
    public boolean[][] getGrid() {
        return this.grid;
    }
}
