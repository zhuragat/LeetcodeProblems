package easy.array.AATest;

class Solution {
    public int countArrangement(int N) {
        int sum = N;
        for (int i = 1; i < N; i++) {
            int count = N / (i + 1);
            sum *= count;
        }
        return sum;
    }
}
