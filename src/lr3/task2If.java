package lr3;

import java.util.Scanner;

public class task2If {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String x = in.nextLine().toLowerCase();

        if (x.equals("понедельник")){
            System.out.println(1);    
        } else if (x.equals("вторник")){
            System.out.println(2);
        } else if (x.equals("среда")){
            System.out.println(3);
        } else if (x.equals("четверг")){
            System.out.println(4);
        } else if (x.equals("пятница")){
            System.out.println(5);
        } else if (x.equals("суббота")){
            System.out.println(6);
        } else if (x.equals("воскресенье")){
            System.out.println(7);
        } else{
            System.out.println("Введено некорректное значение");
        }

    }
}
