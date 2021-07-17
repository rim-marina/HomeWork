import java.util.Arrays;
import java.util.Random;

public class Unit3Task7 {
    //Создайте массив из 12 случайных целых чисел из отрезка [0;15].
    //Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0;
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));

        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }

        int point = 0;

        for(int i = 0; i < array.length ; i++) {
            if (array[i] == max){
                point = i;
            }
        }
        System.out.println(point);
    }
}
