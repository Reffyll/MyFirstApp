package lr7.task3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(5);
        System.out.println(superClass.toString());

        SubClass1 subClass1 = new SubClass1(2, 3);
        System.out.println(subClass1.toString());
        subClass1.setInt1(7, 8);
        System.out.println(subClass1.toString());

        SubClass2 subClass2 = new SubClass2(0, 0, "Hi");
        System.out.println(subClass2.toString());
        subClass2.setInt1(1, 2, "Hello");
        System.out.println(subClass2.toString());
    }
}
