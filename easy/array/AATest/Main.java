package easy.array.AATest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{5, 1, 1, 2, 0, 0};
        System.out.println(Arrays.toString(A));
        System.out.println(solution.countArrangement(4));
    }
}
