/**
 * twoSum
 */
public class twoSum {
    public int[] solution(int[] nums, int target) {
        int[] indexes = new int[2];
        int size = nums.length;
        for (int first = 0; first < size; first++) {
            for (int second = first + 0; second < size; second ++) {
                if (nums[first] + nums[second] == target) {
                    indexes[0] = first;
                    indexes[1] = second;
                }
            }
        }
        return indexes;
    }
}