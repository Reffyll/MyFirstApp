package lr4;

import java.text.DecimalFormat;

public class task2 {
    public static void main(String[] args) {
        int figure = 10; // число строк которое необходимо вывести
        int z = 0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        DecimalFormat dF = new DecimalFormat("00");
        for (int i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + dF.format(i) + " ");
            for (int j = 0; j <= z; j++){
                System.out.print("+");

            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
