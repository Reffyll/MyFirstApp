package lr5;

public class task5 {
    public static void main(String[] args) {
        Test5 example1 = new Test5(21);
        System.out.println("Число = " + example1.PrintInt());

        example1.Set(15);
        System.out.println("Число = " + example1.PrintInt());

        example1.Set(125);
        System.out.println("Число = " + example1.PrintInt());

        example1.Set(-15);
        System.out.println("Число = " + example1.PrintInt());

        example1.Set();
        System.out.println("Число = " + example1.PrintInt());
    }

    static class Test5 {
        private int int1;
        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }

        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        public int PrintInt() {
            return int1;
        }

        Test5(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}
