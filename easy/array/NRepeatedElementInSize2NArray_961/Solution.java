package easy.array.NRepeatedElementInSize2NArray_961;

import java.util.Arrays;

/**
 961. N-Repeated Element in Size 2N Array
 https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

 In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

 Return the element repeated N times.


 Example 1:

 Input: [1,2,3,3]
 Output: 3
 Example 2:

 Input: [2,1,2,5,3,2]
 Output: 2
 Example 3:

 Input: [5,1,5,2,5,3,5,4]
 Output: 5


 Note:

 4 <= A.length <= 10000
 0 <= A[i] < 10000
 A.length is even
 */
class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            for (int j = 0; j < i; j++) {
                if(a==A[j])
                    return A[j];
            }
        }
        return 0;
    }
}
