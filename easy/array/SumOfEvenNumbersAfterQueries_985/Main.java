package easy.array.SumOfEvenNumbersAfterQueries_985;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{
                {1, 0},
                {-3, 1},
                {-4, 0},
                {2, 3}
        };
        System.out.println(Arrays.toString(solution.sumEvenAfterQueries(A, queries)));
    }
}
