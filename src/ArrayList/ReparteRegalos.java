package ArrayList;

import java.util.ArrayList;

public class ReparteRegalos {
    public static void main(String[] args) {
        System.out.println(reparte(3,2,4,7));
    }

    public static String reparte (int portalInicial, int ...secuencia){
        int min = Integer.MAX_VALUE;
        int posicion = 0;
        String resultado = "";
        ArrayList<Integer> orden = new ArrayList<>();
        ArrayList<Integer> portales = new ArrayList<>();
        for (int i = 0; i < secuencia.length; i++) {
            portales.add(secuencia[i]);
        }

        for (int i = 0; i < portales.size(); i++) {
            for (int j = 0; j < portales.size(); j++) {
                if(portales.get(j) != portalInicial && !orden.contains(portales.get(j))) {
                    if (Math.abs(portalInicial - portales.get(j)) < min) {
                        min = Math.abs(portalInicial - portales.get(j));
                        posicion = j;
                    } else if (Math.abs(portalInicial - portales.get(j)) == min) {
                        if (portales.get(posicion) < portales.get(j)) {
                            posicion = j;
                        }
                    }
                }
            }
            orden.add(portales.get(posicion));
            min = Integer.MAX_VALUE;
            portalInicial = portales.get(posicion);

        }
        for (int i:orden
             ) {
            resultado+=i +" ";
        }
        return resultado;
    }
}
