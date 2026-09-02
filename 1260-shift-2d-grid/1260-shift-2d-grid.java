import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int index = (i * n + j - k + total) % total;
                int row = index / n;
                int col = index % n;

                result.get(i).add(grid[row][col]);
            }
        }

        return result;
    }
}