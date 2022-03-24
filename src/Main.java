import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args){

        Monstruo sully = new Monstruo("Sully",
                3.2f,
                1000,
                true,
                false,
                "Azul",
                new ArrayList<>(Arrays.asList("Fuerte", "Gigante")));

        Mocoso Buu = new Mocoso("Boo",
                0.70f,
                30,
                "Verde con palmeras");

        sully.espantar();
        Buu.llorar();

    }
}
