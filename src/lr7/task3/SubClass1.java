package lr7.task3;

public class SubClass1 extends SuperClass{
    public int int2;

    public SubClass1(int int1) {
        super(int1);
    }

    public SubClass1(int int1, int int2) {
        super(int1);
        this.int2 = int2;
    }

    public void setInt1(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() +
                " int1 = " + this.int1 +
                " int2 = " + this.int2;
    }
}
