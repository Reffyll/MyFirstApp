package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        if (size < 0){
            System.out.println("Введено некорректное значение");
            return;
        }
        Random random = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++){
            int x = 0;
            x = random.nextInt( 100);
            ints[i] = x;
        }
        System.out.println(Arrays.toString(ints));
        int min = ints[0];
//        int[] indexes = new int[20];
        int ind = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] < min){
                min = ints[i];
                ind = i;
            }
        }
        System.out.println("Наименьшее число: " + min);

        System.out.println("Его индекс: " + ind);
//        System.out.println(Arrays.toString(indexes));
    }
}


