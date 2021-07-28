import java.util.Arrays;
import java.util.Random;

public class Unit3Task8 {
    //Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и
    //третий массив из 10 действительных чисел.
    //Каждый элемент с i-ым индексом третьего массива должен равняться отношению
    // элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
    // Вывести все три массива на экран (каждый на отдельной строке),
    // затем вывести количество целых элементов в третьем массиве.

    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];     //e3[i] = e1[i] / e2[i]

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(9);
            array2[i] = random.nextInt(9);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int counterInteger = 0;

        for(int i = 0; i < array3.length; i++){
            if(array2[i] != 0){
                array3[i] = (double) array1[i] / array2[i];
                if(array3[i] % 1 == 0){
                    counterInteger++;
                }
            }else {
                array3[i] = Double.POSITIVE_INFINITY;
            }
        }
        System.out.println(Arrays.toString(array3));
        System.out.println("Integer from third array " + counterInteger);


    }
}
