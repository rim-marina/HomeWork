import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    //Ввести размерность массива с клавиатуры.
    //Создать массив этого размера и заполнить случайными значениям.
    // Вывести на экран все элементы в строчку через пробел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array`s size: ");
        int length = scanner.nextInt();

        while(length <= 0){
            System.out.println("Incorrect. Try again");
            length = scanner.nextInt();
        }

        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
