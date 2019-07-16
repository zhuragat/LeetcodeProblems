package array.FindCommonCharacters_1002;

import java.util.LinkedList;
import java.util.List;

/**
 1002. Find Common Characters
 https://leetcode.com/problems/find-common-characters/

 Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

 You may return the answer in any order.


 Example 1:

 Input: ["bella","label","roller"]
 Output: ["e","l","l"]
 Example 2:

 Input: ["cool","lock","cook"]
 Output: ["c","o"]

 Note:

 1 <= A.length <= 100
 1 <= A[i].length <= 100
 A[i][j] is a lowercase letter
 */
class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new LinkedList<>();
        int[] dict = new int[26];

        // fill dict with the number of the first word letters
        for (int i = 0; i < A[0].length(); i++) {
            dict[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            String str = A[i];
            int[] curr = new int[26];

            // fill curr with current word's letter number
            for (int j = 0; j < str.length(); j++) {
                curr[str.charAt(j) - 'a']++;
            }

            // update dict with min values
            for (int j = 0; j < 26; j++) {
                dict[j] = Math.min(dict[j], curr[j]);
            }
        }

        // convert int values of chars to String
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < dict[i]; j++) {
                res.add(String.valueOf((char)(i + 'a')));
            }
        }

        return res;
    }
}

