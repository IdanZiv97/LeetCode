import java.util.zip.CRC32C;

/**
 * jumpGame
 */
public class jumpGame {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int currentIndex = 0;
        int maxJump = 0;
        //If we can reach the end of the array than the max jump from the first index will always be less than the size of it
        for (; currentIndex < size && currentIndex <= maxJump; currentIndex++) {
            maxJump = Math.max(currentIndex + nums[currentIndex], maxJump);
        }
        if (currentIndex == size) {
            return true;
        } else {
            return false;
        }
    }
}