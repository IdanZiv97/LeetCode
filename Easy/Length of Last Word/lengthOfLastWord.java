public class lengthOfLastWord {
    public static int length(String s) {
        int lastCharIndex = s.length() - 1;
        int length = 0;
        boolean startedCounting = false;
        while (lastCharIndex >= 0) {
            if (s.charAt(lastCharIndex) != ' ') {
                startedCounting = true;
            }
            if (startedCounting) {
                if (s.charAt(lastCharIndex) != ' ') {
                    length++;
                    lastCharIndex--;
                } else {
                    break;
                }
            } else {
                lastCharIndex--;
            }
        }
        return length;
    }
}
