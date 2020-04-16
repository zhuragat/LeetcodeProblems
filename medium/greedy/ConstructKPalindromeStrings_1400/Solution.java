package medium.greedy.ConstructKPalindromeStrings_1400;

class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 != 0)
                cnt++;
        }
        return cnt <= k;
    }
}