import java.util.Arrays;
import java.util.Random;

public class Unit3Task11 {
    // Найти произведение элементов, кратных 3.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int multiplication = 1;

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            if(array[i] % 3 == 0){
                multiplication *= array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(multiplication);


    }
}
