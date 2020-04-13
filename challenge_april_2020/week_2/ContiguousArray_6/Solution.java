package challenge_april_2020.week_2.ContiguousArray_6;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int key = 0;
        int ans = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            key = nums[i] == 1 ? key + 1 : key - 1;

            if (map.containsKey(key)) {
                ans = Math.max(ans, i - map.get(key));
            } else map.put(key, i);
        }

        return ans;
    }
}