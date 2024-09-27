package lr7.task4;

public class SubClass2 extends SubClass1{
    public int int2;

    public SubClass2(char char1, String str1) {
        super(char1, str1);
    }

    public SubClass2(char char1, String str1, int int2) {
        super(char1, str1);
        this.int2 = int2;
    }

    public SubClass2 createCopySubClass2(char char1, String str1, int int2){
        SubClass2 copySubClass2 = new SubClass2(char1, str1, int2);
        copySubClass2.char1 = this.char1;
        copySubClass2.str1 = this.str1;
        copySubClass2.int2 = this.int2;
        return copySubClass2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " char = " + char1 + " str = " + str1 + " int = " + int2;
    }
}
