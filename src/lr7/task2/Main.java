package lr7.task2;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassTest =
                new SuperClassTest("Передал в конструктор суперкласса");
        System.out.println(superClassTest.getStr1());
        SubClassTest subClassTest1 =
                new SubClassTest("Передал в конструктор подкласса");
        System.out.println(subClassTest1.getStr1() + " x = " + subClassTest1.int1);
        SubClassTest subClassTest2 =
                new SubClassTest("Передал в конструктор подкласса с 2 параметрами", 10);
        System.out.println(subClassTest2.getStr1() + " x = " + subClassTest2.int1);

        subClassTest2.setValues();
        System.out.println(subClassTest2.getStr1() + " x = " + subClassTest2.int1);

        subClassTest2.setValues(10);
        System.out.println(subClassTest2.getStr1() + " x = " + subClassTest2.int1);

        subClassTest2.setValues("Hi");
        System.out.println(subClassTest2.getStr1() + " x = " + subClassTest2.int1);

        subClassTest2.setValues("hello", 5);
        System.out.println(subClassTest2.getStr1() + " x = " + subClassTest2.int1);

    }
}
