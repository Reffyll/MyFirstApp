package lr3;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {

        int size = 10;

        char[] array1 = new char[size];
        char[] arr_en = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int j = 0;
        for (int i = 0; i < array1.length; i++){
            array1[i] = arr_en[j];
            j = j + 2;
        }
        System.out.println(Arrays.toString(array1));
        for (int i = array1.length-1; i >= 0; i--){
            System.out.print(array1[i] + " ");
        }

    }
}


//    Напишите программу, в которой создается одномерный
//        символьный массив из 10 элементов. Массив заполняется буквами «через
//        одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//        ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//        порядке. Размер массива задается переменной.