package challenge_april_2020.week_1.MaximumSubarray_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{1,-2,3,4,-4,5};
        System.out.println(Arrays.toString(A));
        System.out.println(solution.maxSubArray(A));
    }
}
