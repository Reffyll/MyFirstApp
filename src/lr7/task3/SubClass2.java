package lr7.task3;

public class SubClass2 extends SubClass1{
    String str1;

    public SubClass2(int int1) {
        super(int1);
    }

    public SubClass2(int int1, int int2, String str1){
        super(int1, int2);
        this.str1 = str1;
    }

    public void setInt1(int int1, int int2, String str1) {
        this.int1 = int1;
        this.int2 = int2;
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() +
                " int1 = " + this.int1 +
                " int2 = " + this.int2 +
                " str1 = " + this.str1;
    }
}
