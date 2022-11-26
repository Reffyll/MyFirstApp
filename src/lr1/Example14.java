package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int number = in.nextInt();
        int numberMinus1 = number - 1;
        int numberPlus1 = number + 1;
        int numberSquare = (number + numberMinus1 + numberPlus1)*(number + numberMinus1 + numberPlus1);
        System.out.println("Число на единицу меньше введённого: " + numberMinus1);
        System.out.println("Число: " + number);
        System.out.println("Число на единицу больше введенного: " + numberPlus1);
        System.out.println("Квадрат суммы первых трех чисел: " + numberSquare);
        in.close();
    }
}
