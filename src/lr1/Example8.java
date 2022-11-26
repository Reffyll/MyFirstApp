package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели");
        String day = in.nextLine();

        System.out.println("Введите название месяца");
        String month = in.nextLine();

        System.out.println("Введите дату");
        int date = in.nextInt();
        System.out.println("День недели: " + day);
        System.out.println("Дата: " + date);
        System.out.println("Месяц: " + month);
        in.close();
    }
}
