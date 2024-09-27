package lr6;

public class task4 {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.dvoynojFactorial(6));
    }

}
class Factorial{
    static int dvoynojFactorial(int a){
        int fact = 1;
        if (a % 2 == 0){
            while (a >= 2){
                fact *= a;
                a = a - 2;
            }
        }else if (a % 2 == 1){
            while (a >= 1){
                fact *= a;
                a = a - 2;
            }
        }
        return fact;
    }
}



//4. Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, переданного
// аргументом методу. По определению, двойной факториал числа п (обозначается как n!!) — это произведение через одно
// всех чисел, не больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного
// п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. Предложите версию метода без рекурсии
// и с рекурсией.