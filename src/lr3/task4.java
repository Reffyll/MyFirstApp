package lr3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 разных целых числа");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Результат с использованием цикла for");
        if (a < b){
            for(int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        } else {
            for(int i = b; i <= a; i++){
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        System.out.println("Результат с использованием цикла while");
        if (a < b){
            while (a <= b){
                System.out.print(a + " ");
                a++;
            }
        } else {
            while (b <= a){
                System.out.print(b + " ");
                b++;
            }
        }
    }
}


//4. Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).