package easy.string.ToLowerCase_709;

/**
 709. To Lower Case
 Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 Example 1:

 Input: "Hello"
 Output: "hello"
 Example 2:

 Input: "here"
 Output: "here"
 Example 3:

 Input: "LOVELY"
 Output: "lovely"
 */
class Solution {
    public String toLowerCase(String str) {
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) res.append(c < 91 && c > 64 ? (char) (c + 32) : c);
        return String.valueOf(res);
    }
}