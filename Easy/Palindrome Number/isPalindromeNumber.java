import java.util.ArrayList;

/**
 * 
 */
public class isPalindromeNumber {
   public boolean solution(int x) {
       //If the number is negative the '-' will always break the palindrome
       if (x < 0) {
           return false;
       }
       //turning int to array of numbers
       ArrayList<Integer> array = new ArrayList<Integer>();
       do {
        array.add(x % 10);
        x /= 10;
       } while (x > 0);
       int start = 0;
       int end = array.size() - 1;
       boolean isPalindrome = true; //flag
       //Case - len == 2 so the digits must be identical
       if (array.size() == 2 && array.get(start) == array.get(end)) {
           isPalindrome = false;
       } else {
           isPalindrome = false;
       }
       //General
       while (isPalindrome && start != end) {
           if (array.get(start) != array.get(end)) {
               isPalindrome = false;   
           }
           end--;
           start++;
       }
       return isPalindrome;
    }
}