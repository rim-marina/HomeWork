public class Unit2Task3 {
    //Вычислить:  1+2+4+8+…+256
    public static void main(String[] args) {

        int term = 1;
        int result = 0;

        while(term<=256){
            result += term;
            term *= 2;
        }
        System.out.println(result);
    }
}
