package easy.hash_table.IslandPerimeter_463;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(solution.islandPerimeter(grid));
    }
}
