package lr5;

public class task4 {
    public static void main(String[] args) {

        Test4 example1 = new Test4(12, 'A');
        Test4 example2 = new Test4(65.1267);
    }

    static class Test4 {

        private char ch1;
        private int int1;

        Test4(int a, char b) {
            this.int1 = a;
            this.ch1 = b;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length);
        }

        Test4(double c) {
            char ch1 = (char) c;
            int1 = (int) ((c - (int) c) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1);
        }
    }
}