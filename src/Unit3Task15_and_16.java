import java.util.Arrays;
import java.util.Random;

public class Unit3Task15_and_16 {
    //"Сожмите» массив, выбросив из него каждый второй элемент.
    //«Освободившиеся» места массива заполните нулями.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int[] halfArray = new int[array.length / 2];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            halfArray[index] = array[i];
            index++;
            i++;
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(halfArray));
    }
}
