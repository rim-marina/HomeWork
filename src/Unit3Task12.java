import java.util.Arrays;
import java.util.Random;

public class Unit3Task12 {
    // Найти среднее арифметическое элементов с нечетными номерами.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] % 2 != 0){
                sum += array[i];
                count++;
            }
        }
        double average = (double) sum / count;

        System.out.println(Arrays.toString(array));
        System.out.println(average);
    }
}
