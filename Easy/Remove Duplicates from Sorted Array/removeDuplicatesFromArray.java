/**
 * Solution for problem 26 Remove Duplicates from Sorted Array
 * link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class removeDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size <= 1) {
            return 1; //the index 0 + 1
        }
        int ptrDuplicate = 1; // we start comparing from the second element, so we can find duplicates of the first item
        int ptrUnique = 0;
        int nonDuplicates = 1; //there is at least 1
        while (ptrDuplicate < size) {
            if (nums[ptrUnique] != nums[ptrDuplicate]) {
                nums[nonDuplicates] = nums[ptrDuplicate];
                nonDuplicates++;
                ptrUnique = ptrDuplicate;
                ptrDuplicate++;
            } else { // found a duplicate
                ptrDuplicate++;
            }
        }
        return nonDuplicates;
    }
}