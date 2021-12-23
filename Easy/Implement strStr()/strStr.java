/**
 * Solution for problem 28. Implement strStr()
 * link: https://leetcode.com/problems/implement-strstr/
 */
public class strStr {
    public int implementation(String haystack, String needle) {
        //Using Regex
        java.util.regex.Pattern substring = java.util.regex.Pattern.compile(needle);
        java.util.regex.Matcher string = substring.matcher(haystack);
        if (string.find()) {
            return string.start();
        }
        return -1;
    }
}