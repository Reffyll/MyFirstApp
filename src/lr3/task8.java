package lr3;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int size = 10;

        char[] array1 = new char[size];
        char[] arr_EN = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int j = 0;
        for (int i = 0; i < array1.length; i++){
            boolean iterator = true;
            while (iterator){
                if(arr_EN[j] != 'A' & arr_EN[j] != 'E' & arr_EN[j] != 'I' & arr_EN[j] != 'O' & arr_EN[j] != 'U'){
                    array1[i] = arr_EN[j];
                    iterator = false;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }

}
