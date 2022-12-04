package lr2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        int result = x % 5;
        System.out.println("результат деления на 5 " + result);
        int result2 = x % 7;
        System.out.println("результат деления на 7 " + result2);
        if (result == 2 && result2 == 1) {
            System.out.println("Введенное число делится на 5 c остатком 2 и делится на 7 с отстатком 1");
        } else {
            System.out.println("Введенное число не делится на 5 c остатком 2 и/или не делится на 7 с отстатком 1");
        }

    }
}
