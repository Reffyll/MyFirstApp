package lr7.task4;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass('A');
        SuperClass copySuperClass= superClass.createCopySuperClass('b');
        System.out.println(superClass);
        System.out.println(copySuperClass);
        System.out.println(superClass == copySuperClass);

        SubClass1 subClass1 = new SubClass1('B', "Hello");
        SubClass1 copySubClass1 = subClass1.createCopySubClass1('a', "str");
        System.out.println(subClass1);
        System.out.println(copySubClass1);
        System.out.println(subClass1 == copySubClass1);

        SubClass2 subClass2 = new SubClass2('B', "Hello", 10);
        SubClass1 copySubClass2 = subClass2.createCopySubClass2('a', "str", 45);
        System.out.println(subClass2);
        System.out.println(copySubClass2);
        System.out.println(subClass2 == copySubClass2);
    }
}
