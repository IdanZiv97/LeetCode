/**
 * Solution to problem 53 Maximum Array
 * link: https://leetcode.com/problems/maximum-subarray/
 * Using Kadane's Algorithm
 */
public class maximumSubarrayKadane {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int index = 0; index < size; index++) {
            sum += nums[index];
            max = Math.max(max, sum);
            // check if the sum has decreased from the last iteratiom
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}