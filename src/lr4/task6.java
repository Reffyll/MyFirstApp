package lr4;

import java.util.Random;
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = in.nextInt();
        int arrayA[][] = new int[a][b];

        for (int i = 0 ; i < a; i++) {
            for (int j = 0 ; j < b; j++) {
                arrayA[i][j] = random.nextInt(100);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println("");
        }

        int deletedStr = random.nextInt(a-1);
        int deletedStolbec = random.nextInt(b-1);

        System.out.println("удаляемая строка: " + deletedStr);
        System.out.println("удаляемый столбец: " + deletedStolbec);

        int arrayB[][] = new int[a-1][b-1];
        for (int i = 0, s = 0; i<a-1; s++) {
            if (s!=deletedStr){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deletedStolbec) {
                        arrayB[i][j] = arrayA[s][k];
                        System.out.print(arrayA[i][j] + " ");
                        j++;
                    }
                }
                System.out.println("");
                i++;
            }
        }
    }
}