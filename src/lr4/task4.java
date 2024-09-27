package lr4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("00");
        int z = 0;
        System.out.print("Введите высоту треугольника: ");
        int height = id.nextInt();
        int [][] triangle = new int [height][];
        for (int i=0;i<triangle.length;i++){
            int j = i+1;
            triangle[i]=new int[j];
        }

        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                triangle[i][j] = 2;
            }
        }

        for (int i =0; i < height; i++){
            System.out.print("номер строки " + dF.format(i+1) + " : ");
            for (int j = 0; j < triangle[i].length; j++){
                System.out.print(triangle[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}