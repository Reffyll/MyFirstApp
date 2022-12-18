package lr4;

import java.util.Random;
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = in.nextInt();
        int[][] arraySnake = new int[a][b];
        int hvost = 0;
        int telo = 0;
        int h = 0;

        for (int i = 0; h < arraySnake.length ; h++) {
            for (int j = 0; j <(arraySnake[i].length - hvost); j++) {
                arraySnake[i][j] = telo;
                telo++;
            }
            if(i< arraySnake.length-1) {
                i++;}
            for (int o=a-1; o > hvost; o--) {
                arraySnake[o][arraySnake[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;

        for (int i = 0; i < arraySnake.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < arraySnake[i].length; j++){
                System.out.print(arraySnake[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}