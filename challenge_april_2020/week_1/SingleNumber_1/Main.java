package challenge_april_2020.week_1.SingleNumber_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{4,1,2,1,2};
        System.out.println(Arrays.toString(A));
        System.out.println(solution.singleNumber(A));
    }
}
