/**
 * Solution to problem 53 Maximum Array
 * link: https://leetcode.com/problems/maximum-subarray/
 * Using divide and conquer method.
 */
public class maximumSubarrayDivideAndConquer {
    public int maxSubArray(int[] nums) {
        return rec(nums, 0, nums.length-1);
    }

    int rec(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        int middle = (start + end) / 2;
        // check the maximum subarray which can we contained in the left half and the right half
        int sum = 0;
        int maxLeft, maxRight;
        maxLeft = maxRight = Integer.MIN_VALUE;
        for (int index = middle ; index >= start; index--) {
            sum += nums[index];
            if (sum > maxLeft) {
                maxLeft = sum;
            }
        }
        sum = 0; //reset sum to retrive maximum data from the right side
        for (int index = middle + 1; index <= end; index++) {
            sum += nums[index];
            if (sum > maxRight) {
                maxRight = sum;
            }
        }
        // return max that can be contained on one half of the array alone.
        int maxFromOneSide = Math.max(rec(nums, start, middle), rec(nums, middle + 1, end));
        // find the maximum subarray
        return Math.max(maxFromOneSide, maxRight + maxLeft);
    }
}