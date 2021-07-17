import java.util.Arrays;
import java.util.Random;

public class Unit3Task19 {
    //
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
    }
}