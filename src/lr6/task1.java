package lr6;

public class task1 {


    public static void main(String[] args) {
        A simvol = new A('T');
        A stroka1 = new A("Использование конструктора для строки");
        char[] massivSimvolov= {'H', 'e', 'l', 'l', 'o', '!'};
        A strokaIzMassiva = new A(massivSimvolov);
        char[] massivSimvol = {'T'};
        A simvolIzMassiva = new A(massivSimvol);

        System.out.println(simvol.perem2);
        System.out.println(simvolIzMassiva.perem2);

        System.out.println(stroka1.perem1);
        System.out.println(strokaIzMassiva.perem1);

    }
}
class A {
    String perem1;
    char perem2;
    A(String a){
        perem1 = a;
    }
    A(char b){
        perem2 = b;
    }
    A(char ... c){
        if (c.length == 1){
            perem2 = c[0];
        }
        else {
            perem1 = new String(c);
        }
    }
}


//1. Напишите программу с классом, в котором есть два ноля: символьное и текстовое. В классе должен быть перегруженный
// метод для присваивания значений нолям. Если метод вызывается с символьным аргументом, то соответствующее значение
// присваивается символьному полю. Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля.
// Методу аргументом также может передаваться символьный массив. Если массив состоит из одного элемента, то он определяет
// значение символьного поля. В противном случае (если в массиве больше одного элемента) из символов массива формируется
// текстовая строка и присваивается значением текстовому полю.