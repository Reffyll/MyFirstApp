package lr6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int x = in.nextInt();
        D test = new D();
        System.out.println(test.summaKvadratov(x));
    }

}
class D{
    static int summaKvadratov(int n){
        int summ = 0;
        if (n < 1) return 0;
        for (int i = 1; i <=n; i++){
            summ = summ + i * i;
        }
        return summ;
    }
}


//5. Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных
// чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу. Предложите версию метода с рекурсией и без рекурсии.
// Для проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6