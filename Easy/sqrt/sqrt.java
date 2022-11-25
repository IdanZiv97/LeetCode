import java.rmi.server.RemoteRef;

import javax.sound.midi.spi.MidiFileReader;

/**
 * sqrt
 */
public class sqrt {
    public int binarySearch(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0, right = x, middle, result;
        while (left < right) {
            middle = left + (right - left) / 2;
            result = middle * middle;
            if (result == x) {
                return middle;
            } else if (result > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        } 
        return (int) left;
    } 
}