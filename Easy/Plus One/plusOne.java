/**
 * Solution to problem 66 Plus One
 * link: https://leetcode.com/problems/plus-one/
 */
public class plusOne {
    public int[] solution(int[] digits) {
        int size = digits.length;
        for (int index = size - 1; index >= 0; index--) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index] = 0; // since we reached the maximum value and we need to continute
        }
        // in case of a number that its digits are 9's, we need to create a new number, bigger one who starts
        // with 1 followed by 0's
        int[] newNumber = new int[size + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}