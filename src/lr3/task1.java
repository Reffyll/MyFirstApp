package lr3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7");
        int x = in.nextInt();

        if (x > 7 | x < 1){
            System.out.println("введено некорректное значение");
        }
        switch (x){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }

    }
}


//1. Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.
