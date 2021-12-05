import java.util.EmptyStackException;
import java.util.Stack;

/**
 * DailyTemperatures
 */
public class DailyTemperatures {
    
    public int[] solution(int[] temperatures) {
        int size = temperatures.length;
        int[] answer = new int[size];
        // Create stack to store all the days we went through and didn't find a match for them yet
        Stack<Integer> previousDays  = new Stack<Integer>();
        // Iteratre through each day and find out if it is a warmer day than any of the days
        for (int i = 0; i < size; i++) {
            // check through te prev days, if there are any - if the day is not warmer than a prev we know for sure
            // that the current day can't be the nearest day to recive a warmer for any previous day
            while (!previousDays.empty() && temperatures[previousDays.peek()] < temperatures[i]) {
                answer[previousDays.peek()] = i - previousDays.peek();
                previousDays.pop();
            }
            previousDays.push(i);
        }
        return answer;
    }
}