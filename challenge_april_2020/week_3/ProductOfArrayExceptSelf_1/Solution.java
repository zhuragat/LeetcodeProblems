package challenge_april_2020.week_3.ProductOfArrayExceptSelf_1;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int product = 1;
        for (int i = len - 2; i >= 0; i--) {
            product *= nums[i + 1];
            ans[i] *= product;
        }

        return ans;
    }
}
