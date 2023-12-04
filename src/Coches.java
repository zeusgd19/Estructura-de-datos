import java.util.ArrayList;
import java.util.Collections;
public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        String coche;
        coche = Utilidades.leerCadena("Marca de coche");
        while(!coche.isEmpty()){
            coches.add(coche);
            coche = Utilidades.leerCadena("Marca de coche");
        }

        Collections.sort(coches);

        for (String cocheActual: coches){
            System.out.println(cocheActual);
        }
    }
}

