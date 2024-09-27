package lr5;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число 1");
        int int1 = id.nextInt();
        System.out.println("Введите число 2");
        int int2 = id.nextInt();

        Test3 example1 = new Test3();
        Test3 example2 = new Test3(int1);
        Test3 example3 = new Test3(int1,int2);
    }
    static class Test3 {

        private int num1;
        private int num2;

        Test3(){
            System.out.println("Вызов конструктора объекта без аргументов");
        }

        Test3(int num1){
            System.out.println("Вызов конструктора объекта с 1 аргументом");
            this.num1 = num1;

        }

        Test3(int num1, int num2){
            System.out.println("Вызов конструктора объекта с 2 аргументами");
            this.num1 = num1;
            this.num2 = num2;

        }

    }
}
