/**
 * Solution for problem 35 Search Insert Position
 * link: https://leetcode.com/problems/search-insert-position/
 */
public class searchInsertPosition {
    public int insertPosition(int[] nums, int target) {
        //perfom binary serach
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) { //continue the search on the left
                right = middle - 1;
                middle = (right + left) / 2;
            } else { //continue searching on the right
                left = middle + 1;
                middle = (right + left) / 2;
            }
        }
        return middle + 1;
    }
}