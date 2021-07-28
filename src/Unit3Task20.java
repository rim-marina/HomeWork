import java.util.Arrays;
import java.util.Random;

public class Unit3Task20 {
    //Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(max <= array[i]){
                max = array[i];
            }
        }

        array[0] = max;

        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }
}