public class Unit2Task8 {
    // нарисовать оставшиеся 2 треугольника
    public static void main(String[] args) {
        Unit2Task8 triangle = new Unit2Task8();
        triangle.firstTriangle();
        System.out.println();
        triangle.secondTriangle();
    }

    public void firstTriangle(){
        int i;
        int j;
        int k;

        for(i = 0; i < 4; i++){
            for(j = i; j < 3; j++){
                System.out.print(" ");
            }
            for(k = (j - i); k < 4; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void secondTriangle(){
        int i;
        int j;
        int k;

        for(i = 4; i > 0; i--){
            for(j = (4-i); j > 0; j--){
                System.out.print(" ");
            }
            for(k = i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
