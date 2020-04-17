package challenge_april_2020.week_3.NumberOfIslands_3;

public class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    check(grid, i, j);
                    ans++;
                }
            }
        }

        return ans;
    }

    void check(char[][] arr, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '0') return;
        arr[i][j] = '0';
        check(arr, i + 1, j);
        check(arr, i - 1, j);
        check(arr, i, j + 1);
        check(arr, i, j - 1);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid));
    }
}
