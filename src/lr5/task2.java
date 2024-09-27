package lr5;

public class task2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setChar('A', 'D');
        test2.printCharArray();
    }
}
class Test2 {

    private char ch1;
    private char ch2;

    public void setChar(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void printCharArray() {

        int int1 = ch1;
        int int2 = ch2;
        if (ch1 > ch2) {
            int1 = ch2;
            int2 = ch1;
        }
        int j = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println("Symbol " + j + " = " + (char) i);
            j++;
        }
    }
}


