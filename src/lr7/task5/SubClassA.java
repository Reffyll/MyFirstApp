package lr7.task5;

public class SubClassA extends SuperClass{

    protected int int1;

    public SubClassA(String str1) {
        super(str1);
    }

    public SubClassA(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }

    @Override
    public void showInfo() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + this.getStr1() + " int = " + int1);
    }
}
