package Unit6;

public interface Methods {
    default double powerToKiloWatt(int horsePower){
        return horsePower * 0.74;
    }

    String description();

    void showInfo();

}
