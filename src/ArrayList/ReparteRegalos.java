package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReparteRegalos {
    public static void main(String[] args) {
        //OK
        System.out.println(reparte(3,2,4,7));
    }

    public static String reparte (int portalInicial, int ...secuencia){
        int min = Integer.MAX_VALUE;
        int posicion = 0;
        String resultado = " ";
        int portalActual = portalInicial;
        ArrayList<Integer> orden = new ArrayList<>();
        ArrayList<Integer> portales = new ArrayList<>();
        for (int k : secuencia) {
            portales.add(k);
        }

        for (int i = 0; i < portales.size(); i++) {
            //No creo que hagan falta 2 bucles. Mira mi solución
            for (int j = 0; j < portales.size(); j++) {
                if(portales.get(j) != portalActual && !orden.contains(portales.get(j))) {
                    if (Math.abs(portalActual - portales.get(j)) < min) {
                        min = Math.abs(portalActual - portales.get(j));
                        posicion = j;
                    } else if (Math.abs(portalActual - portales.get(j)) == min) {
                        if (portales.get(posicion) < portales.get(j)) {
                            posicion = j;
                        }
                    }
                }
            }
            orden.add(portales.get(posicion));
            min = Integer.MAX_VALUE;
            portalActual = portales.get(posicion);

        }
        for (int i:orden
             ) {
            resultado+=i +" ";
        }
        return resultado;
    }

    public static void mainVictor(String[] args) {

        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2, 4));
        System.out.println(repartir(0, portales));

        portales = new ArrayList<>((Arrays.asList(2, 5, 1)));
        System.out.println(repartir(3, portales));

        portales = new ArrayList<>((Arrays.asList(2, 4, 7)));
        System.out.println(repartir(3, portales));
    }
    private static int siguiente(ArrayList<Integer> portals, int desde){
        int diff, min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < portals.size(); i++) {
            //Calcular el mínimo desde el actual
            diff = Math.abs(portals.get(i) - desde);
            if (diff <= min ){
                min = diff;
                index = i;
            }
        }
        return portals.get(index);
    }
    public static String repartir(int aterriza, ArrayList<Integer> portales) {
        String result = "";
        int actual = aterriza;
        Collections.sort(portales);
        while (!portales.isEmpty()) {
            actual = siguiente(portales, actual);
            result += actual + " ";
            portales.remove(Integer.valueOf(actual));
        }
        return result;
    }
}
