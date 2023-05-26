package lr7.task4;

public class SubClass1 extends SuperClass {
    public String str1;

    public SubClass1(char char1) {
        super(char1);
    }

    public SubClass1(char char1, String str1) {
        super(char1);
        this.str1 = str1;
    }

    public SubClass1 createCopySubClass1(char char1, String str1){
        SubClass1 copySubClass1 = new SubClass1(char1, str1);
        copySubClass1.char1 = this.char1;
        copySubClass1.str1 = this.str1;
        return copySubClass1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " char = " + char1 + " str = " + str1;
    }
}
