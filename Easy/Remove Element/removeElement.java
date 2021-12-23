/**
 * Solution to problem 27. Remove Element
 * link:https://leetcode.com/problems/remove-element/
 */
public class removeElement {
    public int remove(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                continue;
            } else {
                nums[i] = nums[size -1];
                nums[size - 1] = val;
                size--;
                i--;
            }
        }
        return size;
    }
}