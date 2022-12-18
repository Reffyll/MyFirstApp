package lr4;

import java.util.Random;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество  столбцов: ");
        int a = in.nextInt();
        System.out.print("Введите количество строк: ");
        int b = in.nextInt();
        int[][] arrayA = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                arrayA[i][j] = random.nextInt(100);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Перевернутый двумерный массив: ");

        int[][] arrayB = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                arrayB[i][j] = arrayA[j][i];
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println("");
        }
    }
}