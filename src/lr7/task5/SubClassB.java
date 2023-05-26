package lr7.task5;

public class SubClassB extends SuperClass{

    protected char char1;

    public SubClassB(String str1) {
        super(str1);
    }

    public SubClassB(String str1, char char1) {
        super(str1);
        this.char1 = char1;
    }

    @Override
    public void showInfo() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + this.getStr1() + " char = " + char1);
    }

}
