package lr6;

public class task7 {
    public static void main(String[] args) {
    char[] a = {'H', 'e', 'l', 'l', 'o'};
    int[]b = getMassiv(a);
    for (int elem:b){
        System.out.print(" " + elem);
    }
    }
    public static int[] getMassiv(char[] a){
        int[] massiv = new int[a.length];
        for (int i = 0; i < a.length; i++){
            massiv[i] = (int)a[i];
        }
        return massiv;
    }
}

//7. Напишите программу со статическим методом, аргументом которому передастся символьный массив,
// а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.