package easy.array.CountLargestGroup_1399;

class Solution {
    static int countLargestGroup(int n) {
        int result = 0;
        int[] arr = new int[37];

        for (int i = 1; i <= n; i++) {
            int sum = findSum(i);
            arr[sum]++;
        }

        int maxSize = 0;
        for (int i = 1; i <= 36; i++) {
            maxSize = Math.max(maxSize, arr[i]);
        }

        for (int i = 1; i <= 36; i++) {
            if (arr[i] == maxSize) result++;
        }

        return result;
    }

    static int findSum(int n) {
        return n == 0 ? 0 : (n % 10) + findSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countLargestGroup(174));
    }
}
