package challenge_april_2020.week_3.LeftmostColumnwithAtLeastAOne_7;

import java.util.List;

interface BinaryMatrix {
    int get(int x, int y);
    List<Integer> dimensions();
}

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> list = binaryMatrix.dimensions();
        int n = list.get(0);
        int m = list.get(1);
        int[] indexes = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            indexes[i] = findFirstIndex(binaryMatrix, i, m - 1);
            if (indexes[i] != -1)
                min = Math.min(min, indexes[i]);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    int findFirstIndex(BinaryMatrix binaryMatrix, int row, int end) {
        int idx = -1;
        int start = 0;
        while (end >= start) {
            int mid = start + ((end - start) / 2);
            if (binaryMatrix.get(row, mid) == 1) {
                idx = mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return idx;
    }
};