public class DailyTemperatures_Array {
    public int[] solution(int[] temperatures) {
        // intitialise an array with 0's as the answer
        int size = temperatures.length;
        int[] answer = new int[size];
        //create the variable to messure the hottest day recorded yet, we will use to decide
        //if there's a chance to a warmer day at all
        int peakTemp = 0;
        for(int i = size - 1; i >= 0; i--) {
            int currentTemperature = temperatures[i];
            if (currentTemperature >= peakTemp) {
                peakTemp = currentTemperature;
                answer[i] = 0; // Because we itterate in reverse over the array, there is no chance it will ever be a warmer day
                continue;
            }
            //If not, than we know that it takes at least 1 day, from current day 'i' to reach a warmer day
            //if it was zero than it means that the current day is the hottest day, which stands in contradiction to the fact we reached
            //this step in the algorithm - we should have set this day as the peak
            int distance = 1;
            //lets calculate the number of days to reach a warmer day
            //we want to reach the point when its first getting warmer
            while(temperatures[i + distance] <= currentTemperature) { 
                // we will add the number of days from the next possible warmer day because
                //otherwise we will itterate each day and will increase the runtime
                distance += answer[i + distance];
            }
            //the loop breaks when we found the warmer day we can find and it 'distance' days after the current day
            answer[i] = distance;
        }
        return answer;
    }
}
