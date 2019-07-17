package array.DuplicateZeros_1089;

/**
 1089. Duplicate Zeros
 https://leetcode.com/problems/duplicate-zeros/

 Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

 Note that elements beyond the length of the original array are not written.

 Do the above modifications to the input array in place, do not return anything from your function.

 Example 1:

 Input: [1,0,2,3,0,4,5,0]
 Output: null
 Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 Example 2:

 Input: [1,2,3]
 Output: null
 Explanation: After calling your function, the input array is modified to: [1,2,3]


 Note:

 1 <= arr.length <= 10000
 0 <= arr[i] <= 9

 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (i != n - 1) n--;
                else arr[i] = -1;
            }
        }
        int shifts = arr.length - n;

        for (int i = arr.length - 1 - shifts; i >= 0; i--) {
            arr[i + shifts] = arr[i];
            if (arr[i] == 0) {
                shifts--;
                arr[i + shifts] = arr[i];
            }
            if (shifts == 0) {
                if (arr[arr.length - 1] == -1) arr[arr.length - 1] = 0;
                return;
            }
        }
    }
}