package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения");
        int yearOfBirth = in.nextInt();
        int year = 2022;
        int age = year - yearOfBirth;
        System.out.println("Возраст: " + age);
        in.close();
    }
}
