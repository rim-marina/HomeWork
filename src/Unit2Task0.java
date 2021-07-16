public class Unit2Task0 {
    //Вывести на экран последовательность чисел от 0 до 10 три раза каждый раз используя  разные циклы.

    public static void main(String[] args) {
        int a = 0;

        while (a<=10){
            System.out.print(a + " ");
            a++;
        }

        System.out.println();

        for (int i=0; i<11; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        int b = 0;

        do{
            System.out.print(b + " ");
            b++;
        }while(b<=10);

    }
}
