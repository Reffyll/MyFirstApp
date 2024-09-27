package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        Integer[] nums = new Integer[size];

        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));

    }
}
