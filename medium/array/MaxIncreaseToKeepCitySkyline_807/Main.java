package medium.array.MaxIncreaseToKeepCitySkyline_807;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        System.out.println(solution.maxIncreaseKeepingSkyline(A));
    }
}
