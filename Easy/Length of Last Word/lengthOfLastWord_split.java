/**
 * Solution to problem number 58. Length of Last Word
 * link: https://leetcode.com/problems/length-of-last-word/
 */
public class lengthOfLastWord_split {
    public int length(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}