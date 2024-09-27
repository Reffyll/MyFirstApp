package lr6;

import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        int[]a = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        for (int elem: a){
            System.out.print(elem + " ");
        }
        System.out.println();
        double average = getMassiv(a);
        System.out.println("Среднее значение массива: " + average);
    }
    public static double getMassiv(int[] a){
        double sum = 0;
        double average;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        average = sum / a.length;
        return average;
    }
}


//8. Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
// а результатом возвращается среднее значение для элементов массива (сумма значений элементов, деленная
// на количество элементов в массиве).
