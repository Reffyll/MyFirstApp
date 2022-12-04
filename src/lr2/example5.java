package lr2;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int units = x % 10;// единицы
        int n = x / 10;
        int tens = n % 10;// десятки
        n = n / 10;
        int hundreds = n % 10;// сотни
        n = n / 10;
        int thousands = n % 10;// тысячи


        System.out.println("Введенное число содержит " + thousands + " тысяч");

    }
}
