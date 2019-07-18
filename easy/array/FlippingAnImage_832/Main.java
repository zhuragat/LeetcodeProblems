package easy.array.FlippingAnImage_832;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        solution.flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(A)));
    }
}
