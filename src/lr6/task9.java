package lr6;

import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        for (int elem: a){
            System.out.print(elem + " ");
        }
        System.out.println();
        int[] b = getMassiv(a);
        for (int elem: b){
            System.out.print(elem + " ");
        }
    }
    public static int[] getMassiv(int[] a){
        int[] massive = new int[a.length];
        char perem1;
        for (int i = 0; i < a.length; i++){
            massive[i] = a[a.length -1 - i];
        }
        return massive;
    }
}



//9. Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
// В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним
// и так далее.