public class addBinary {
    public static int bitwise(int a, int b) {
        while (b != 0) {
            int carry = a & b;
             a = a ^ b;
             b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(addBinary.bitwise(2, 1));
    }
}
