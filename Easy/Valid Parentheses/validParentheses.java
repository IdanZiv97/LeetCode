import java.util.HashMap;
import java.util.Stack;


/**
 * validParentheses solution for problem 20. Valid Parentheses
 * link: https://leetcode.com/problems/valid-parentheses/
 * Explanation: the stack helps us break down the string to recursive substrings
 * Each substring is created whenever we don't meet a an opening parenthese, and we need to scan to find its pair to close the
 * parentheses properly. So when we push this closing parenthese we acutally entering a recursive search with it the end of our
 * substring.
 * When we meet an opening parenthese we expect to find its closing pair at the top of the stack, since we store in the stack
 * only the closing parenthese of each substring, in a recursive manner.
 * The stack should be empty only when we finish the scan and there are no missing closing parentheses
 */
public class validParentheses {
    public static boolean isValid(String s) {
        // create a map of pairs
        HashMap<Character, Character> possiblePairs = new HashMap<Character, Character>();
        possiblePairs.put('{', '}');
        possiblePairs.put('[', ']');
        possiblePairs.put('(', ')');
        int size = s.length();
        Stack<Character> stack = new Stack<Character>();
        //iterate from the end an check if we came across a pair
        for (int index = size - 1; index >= 0; --index) {
            //get current char
            char current = s.charAt(index);
            //check if the char is a key - meaning we met an opening paran
            if (possiblePairs.containsKey(current)) {
                // check for valid pair - we put the paran from outside in, so if we reached the inner opener we should have visited the right closing pair
                if (stack.isEmpty() || possiblePairs.get(current) != stack.pop()) {
                    return false;
                }
            } else { // we didn't find an opening parantheses - lets add it do the stack
                stack.push(current);
            }     
        }
        boolean isValid = stack.isEmpty();
        return isValid;
    }
}