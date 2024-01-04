package Mapas;

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        //OK
        String repartir = repartir(2,10,20,50,200,500);
        System.out.println(repartir);
    }

    public static String repartir(int participantes,int ...billetes){
        Map<Integer, ArrayList<Integer>> botin = new HashMap<>();
        ArrayList<Integer> listaBilletes = new ArrayList<>();
        //Mira mi solución
        for (int i = 0; i < participantes; i++) {
            int posicionBotin = i;
            for (int j = 0; j < billetes.length; j++) {
                    if(j == posicionBotin){
                        listaBilletes.add(billetes[j]);
                        botin.put(i,listaBilletes);
                        posicionBotin +=participantes;
                    }
            }
            listaBilletes = new ArrayList<>();
        }
        return botin.toString();
    }
    public static String repartirVictor(int participantes, int... billetes) {

        Map<Integer, String> reparto = new HashMap<Integer, String>();
        for (int i = 0; i < billetes.length; i++) {
            String botin = reparto.get(i % participantes);
            if (botin == null) {
                reparto.put(i % participantes, billetes[i] + " ");
            } else {
                reparto.put(i % participantes, botin + " " + billetes[i]);
            }
        }
        return reparto.toString();
    }
}
