/**
 * Solution to problem 125. Valid Palindrome
 * link: https://leetcode.com/problems/valid-palindrome/
 */
public class validPalindrome {
    public static boolean isPalindrome(String s) {
        //create pointer to the end of the string
        int size = s.length();
        if (size == 0) {
            return true;
        }
        int start = 0;
        int end = size - 1;
        boolean isPalindrome = true;
        while (isPalindrome && start != end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                ++start;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                --end;
                continue;
            }
            isPalindrome = Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end));
            --end;
            ++start;
            // for even length strings
            if (start > end) {break;}
        }
        return isPalindrome;
    }
}