import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    //Пользователь должен указать с клавиатуры положительное число,
    // а программа должна создать массив указанного размера из случайных целых чисел из [0;15]
    // и вывести его на экран в строку.
    // После этого программа должна определить и сообщить пользователю о том,
    // сумма какой половины массива больше: левой или правой,
    // либо сообщить, что эти суммы модулей равны.
    // Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number ");
        int arrayLength = scanner.nextInt();

        while(arrayLength <= 0){
            System.out.println("You entered incorrect number");
            arrayLength = scanner.nextInt();
        }

        Random random = new Random();
        int[] array = new int[arrayLength];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));

        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 0; i < array.length / 2; i++){
            sumLeft += array[i];
        }

        for(int i = array.length / 2; i < array.length; i++){
            sumRight += array[i];
        }

        if(sumLeft > sumRight){
            System.out.println("Left half is greater");
        }else if(sumLeft < sumRight){
            System.out.println("Right half is greater");
        }else{
            System.out.println("Parts are equals");
        }
    }
}
