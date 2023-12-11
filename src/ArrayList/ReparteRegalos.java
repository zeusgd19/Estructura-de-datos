package ArrayList;

import java.util.ArrayList;

public class ReparteRegalos {
    public static void main(String[] args) {
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
}
