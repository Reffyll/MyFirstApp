package lr4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = id.nextInt();
        int z = 0;
        int [][] rectangle = new int [height][width];
        DecimalFormat dF = new DecimalFormat("00");

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                rectangle[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++){//печать массива
            System.out.print("номер строки " + dF.format(i+1) + " : ");
            for (int j = 0; j <width; j++){
                System.out.print(rectangle[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}