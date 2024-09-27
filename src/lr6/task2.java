package lr6;

public class task2 {
    public static void main(String[] args) {
        B test = new B();
        for (int i = 0; i < 10; i++){
            B.printPole();
        }

    }
}
class B{
    private static int pole = 0;

    static void printPole() {
        System.out.println(pole);
        pole++;
    }
}


//2. Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым
// значением. В классе должен быть описан статический метод, при вызове которого отображается текущее значение
// статического поля, после чего значение поля увеличивается на единицу.