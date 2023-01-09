package lr5;

public class task1 {
    public static void main(String[] args) {
        Test1 Test = new Test1();
        Test.setSymbol('X');
        Test.printSymbolAndHisCode();
    }
}
class Test1 {

    private char char1;
    public void setSymbol(char ch) {
        this.char1 = ch;
    }

    public int getCodeSymbol() {
        return (int) char1;
    }

    public void printSymbolAndHisCode() {
        System.out.println("char = " + char1);
        System.out.println("charCode = " + getCodeSymbol());
    }
}
