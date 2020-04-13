package challenge_april_2020.week_2.ContiguousArray_6;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int key = 0;
        int ans = 0;

        int[] arr = new int[2 * nums.length - 1];
        arr[nums.length - 1] = -1;

        for (int i = 0; i < nums.length; i++) {
            key += nums[i] == 1 ? 1 : -1;

            if (arr[key + nums.length - 1] != 0) {
                ans = Math.max(ans, i - arr[key + nums.length - 1]);
            } else
                arr[key + nums.length - 1] = i;
        }

        return ans;
    }
}