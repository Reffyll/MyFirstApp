package lr2;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        int result = x % 4;
        System.out.println("результат деления на 4 " + result);

        if (result == 0 && x > 10) {
            System.out.println("Введенное число делится на 4 без остатка и при этом оно не меньше 10");
        } else {
            System.out.println("Введенное число не делится на 4 без остатка и/или оно меньше 10");
        }

    }
}
