/**
 * Solution to problem 53 Maximum Array
 * link: https://leetcode.com/problems/maximum-subarray/
 * Using Dynamic Programming:
 * The idea it to create a helper array which will contain in each cell the value
 * of the max array ending with the proper counter part in the input array, this way if all the previous elements
 * benefits the subarray than they will be added with the current element.
 * We will hold a global variable that will indicate the maximum the max value
 */
public class maximumSubarrayDP {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        dp[0] = nums[0]; // there is only one option for a subarray ending with the first element
        int maxSum = dp[0];
        for (int index = 1; index < size; index++) {
            // two options - add the sum to the subarray ending with the previous element start a new subarray
            dp[index] = Math.max(dp[index - 1] + nums[index], nums[index]);
            if (dp[index] > maxSum) {
                maxSum = dp[index];
            }
        }
        return maxSum;
    }
}
