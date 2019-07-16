package array.ReshapeTheMatrix_566;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = new int[][]{
                {1, 2},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(solution.matrixReshape(A, 1, 4)));
    }
}
