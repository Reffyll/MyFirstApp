package lr6;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        int[] b = getMassiv(10, 5, 4, 20, -4, 0, 8);
        System.out.println("Наибольшее значение: " + b[0]);
        System.out.println("Наименьшее значение: " + b[1]);
    }
    public static int[] getMassiv(int ... a){
        int[] massiv = new int[2];
        if (a.length == 0){
            massiv[0] = -1;
            massiv[1] = -1;
            System.out.println("Передайте в метод хотя бы 1 элемент");
        }else if (a.length == 1){
            massiv[0] = a[0];
            massiv[1] = a[0];
        }else {
            Arrays.sort(a);
            massiv[0] = a[a.length - 1];
            massiv[1] = a[0];
        }
        return massiv;
    }
}

//10. Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов,
// переданных методу.
