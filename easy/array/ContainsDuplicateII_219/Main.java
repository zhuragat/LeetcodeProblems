package easy.array.ContainsDuplicateII_219;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println(Arrays.toString(A));
        System.out.println(solution.containsNearbyDuplicate(A, 3));
    }
}
