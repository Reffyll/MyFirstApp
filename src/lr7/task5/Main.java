package lr7.task5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        superClass.showInfo();
        SubClassA subClassA = new SubClassA("Hello from SubClassA", 7);
        subClassA.showInfo();
        SubClassB subClassB = new SubClassB("Hello from SubClassA", 'J');
        subClassB.showInfo();

        SuperClass superClass1 = new SubClassA("Hi", 4);
        superClass1.showInfo();
    }
}
