public class Unit2Task5 {
    //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    // для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
    public static void main(String[] args) {
        System.out.format("%3s%3s", "Ins.", "Cm");
        System.out.println();

        int ins = 1;
        double cm = 2.54;

        while(ins<=20){
            cm = ins * 2.54;
            cm = Math.round(cm * 100.0) / 100.0;
            System.out.println(ins + "    " + cm);
            ins++;
        }
    }
}
