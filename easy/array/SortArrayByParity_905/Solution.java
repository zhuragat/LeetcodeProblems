package easy.array.SortArrayByParity_905;


/**
 905. Sort Array By Parity
 https://leetcode.com/problems/sort-array-by-parity/

 Given an easy.array A of non-negative integers, return an easy.array consisting of all the even elements of A, followed by all the odd elements of A.

 You may return any answer easy.array that satisfies this condition.



 Example 1:

 Input: [3,1,2,4]
 Output: [2,4,3,1]
 The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


 Note:

 1 <= A.length <= 5000
 0 <= A[i] <= 5000
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] A2 = new int[A.length];
        int even = 0, odd = A.length - 1;
        for (int element : A) {
            if (element % 2 == 0) {
                A2[even] = element;
                even++;
            } else {
                A2[odd] = element;
                odd--;
            }
        }
        return A2;
    }
}