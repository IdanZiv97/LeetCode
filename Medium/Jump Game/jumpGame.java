/**
 * jumpGame
 */
public class jumpGame {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int index = 0;
        int lastIndex = size - 1;
        //When you have only one item it is always true
        if (size == 1) {
            return true;
        }
        //The min travel possible
        int distance = nums[0];
        for (; index < size; index++) {
            //when we cant travel no further
            if (distance < 0) {
                return false;
            }
            //we want to see, from each index what is the maximum distance we can jump
            //Regarding the value from the current index
            distance = Math.max(distance, nums[index]);
            //check from this index you can reach last index
            if (index + distance >= lastIndex) {
                return true;
            }
            //We move to the next index - decrease the distance
            distance--;
        }
        //if this point is reached we are in the case where we finised our jumps on the last index
        return true;
    }
}