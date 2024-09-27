package lr7.task3;

public class SuperClass {
    public int int1;
    public SuperClass(int int1){
        this.int1 = int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() +
                " int1 = " + this.int1;
    }
}
