import java.util.HashMap;

/**
 * twoSum
 */
public class twoSum {
    public int[] solution(int[] nums, int target) {
        //Hash map of vlaue (as key) and its index in nums
        HashMap<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        //for each value we need to find target - value in nums,
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (indexes.containsKey(target - nums[i])) {
                return new int[]{indexes.get(target - nums[i]), i};
            }
            indexes.put(nums[i], i);
        }
        throw new IllegalArgumentException("Found no solution!\n");
    }
}