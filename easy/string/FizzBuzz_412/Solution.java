package easy.string.FizzBuzz_412;

import java.util.LinkedList;
import java.util.List;

/**
 * 1108. Defanging an IP Address
 * https://leetcode.com/problems/defanging-an-ip-address/
 * <p>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            if (i % 3 == 0) str = "Fizz";
            if (i % 5 == 0) str = str.equals("Fizz") ? "FizzBuzz" : "Buzz";
            res.add(str);
        }
        return res;
    }
}