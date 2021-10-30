public class romanToInt {
    public int solution(String s) {
        //We need to know if to add the current value or tho deduct.
        int numeral = 0;
        int size = s.length();
        for (int i = 0; i < size - 1; i++) {
            char current = s.charAt(i);
            char next = s.charAt(i + 1);
            int currentValue = getRomanValue(current);
            int nextValue = getRomanValue(next);
            if (currentValue < nextValue) {
                numeral -= currentValue;
            } else {
                numeral += currentValue;
            }
        }
        return numeral + getRomanValue(s.charAt(s.length() - 1));
    }
    private int getRomanValue(char c) {
        int value;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                throw new IllegalArgumentException("Not a roman letter");
        }
        return value;
    }
}
