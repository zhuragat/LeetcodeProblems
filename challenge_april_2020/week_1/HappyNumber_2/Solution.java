package challenge_april_2020.week_1.HappyNumber_2;

import java.util.HashSet;
import java.util.Set;

/**
 Happy Number
 https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/

 Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example:

 Input: 19
 Output: true
 Explanation:
 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.add(n)) return false;
            int sumOfSquareOfDigits = 0;
            while (n > 0) {
                sumOfSquareOfDigits += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sumOfSquareOfDigits;
        }
        return true;
    }
}
