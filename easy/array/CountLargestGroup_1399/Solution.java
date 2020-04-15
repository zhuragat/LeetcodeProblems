package easy.array.CountLargestGroup_1399;

class Solution {
    public int countLargestGroup(int n) {
        int result = 0;
        int[] arr = new int[37];

        for (int i = 1; i <= n; i++){
            int sum = findSum(i);
            arr[sum]++;
        }

        int maxSize = 0;
        for (int i = 1; i <= 36; i++){
            maxSize = Math.max(maxSize, arr[i]);
        }

        for (int i = 1; i <= 36; i++){
            if(arr[i] == maxSize) result++;
        }

        return result;
    }

    int findSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
