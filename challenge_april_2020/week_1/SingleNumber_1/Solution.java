package challenge_april_2020.week_1.SingleNumber_1;

import java.util.HashSet;
import java.util.Set;

/**
 Single Number
 https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3283/

 Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:

 Input: [2,2,1]
 Output: 1
 Example 2:

 Input: [4,1,2,1,2]
 Output: 4
 */
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else set.add(num);
        }
        return set.iterator().next();
    }
}
