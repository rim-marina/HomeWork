import java.util.Arrays;
import java.util.Random;

public class Unit3Task3 {
    //Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
    // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран
    // на отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(99);
            if(array[i]%2==0){
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}
