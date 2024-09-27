package lr3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько чисел последовательности Фибоначчи вы хотите увидеть");
        int x = in.nextInt();
        if (x < 1){
            return;
        }
        int a2 = 0;
        int b2 = 1;
        int c2;
        System.out.println("Последовательность с использованием цикла for");
        System.out.print(b2 + " ");
        for(int i = 1; i < x; i++){
            c2 = a2 + b2;
            System.out.print(c2 + " ");
            a2 = b2;
            b2 = c2;
        }

        System.out.println("");
        System.out.println("Последовательность с использованием цикла while");
        int a = 0;
        int b = 1;
        int c;
        System.out.print(b + " ");
        while (x-1 > 0){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            x--;
        }

    }
}


//3. Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.