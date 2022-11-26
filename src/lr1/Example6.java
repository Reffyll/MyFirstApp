package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Фамилию");
        String LastName = in.nextLine();
        System.out.println("Введите Имя");
        String FirstName = in.nextLine();
        System.out.println("Введите Отчество");
        String MiddleName = in.nextLine();
        System.out.println("Hello " + LastName + ", " + FirstName + ", " + MiddleName);
        in.close();
    }
}
