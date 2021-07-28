import java.util.Arrays;

public class Unit3Task1 {
    //Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
    // отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
    // Перед созданием массива подумайте, какого он будет размера.

    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 1; i <= array.length; i++){
            array[i-1] = i*2;
        }
        System.out.println(Arrays.toString(array));
    }
}
