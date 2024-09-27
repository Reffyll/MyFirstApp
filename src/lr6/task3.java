package lr6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class task3 {
    public static void main(String[] args) {
        C test = new C();
        int[] massiv = { 5, 7, 9, 4, 1, 10, 2, 8, 3, 6 };
        for (int a:massiv) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Минимальное значение массива: " + C.getMin(massiv));
        System.out.println("Максимальное значение массива: " + C.getMax(massiv));
        System.out.println("Среднее значение массива: " + C.getAverage(massiv));
    }
}
class C{
    static int getMin(int ... a){
        Arrays.sort(a);
        return a[0];
    }
    static int getMax(int ... a){
        Arrays.sort(a);
        return a[a.length - 1];
    }
    static double getAverage(int ... a){
        double average = 0;
        if (a.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
            }
            average = sum / a.length;
        }
        return average;
    }

}


//3. Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное
// количество целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива,
// позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.