package easy.array.RelativeSortArray_1122;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = new int[]{2,42,38,0,43,21};
        System.out.println(Arrays.toString(solution.relativeSortArray(arr1, arr2)));
    }
}