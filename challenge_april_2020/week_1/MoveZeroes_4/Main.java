package challenge_april_2020.week_1.MoveZeroes_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(A));
        solution.moveZeroes(A);
        System.out.println(Arrays.toString(A));
    }
}
