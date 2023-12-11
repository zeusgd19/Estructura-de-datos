package Mapas;

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        String repartir = repartir(2,10,20,50,200,500);
        System.out.println(repartir);
    }

    public static String repartir(int participantes,int ...billetes){
        Map<Integer, ArrayList<Integer>> botin = new HashMap<>();
        ArrayList<Integer> listaBilletes = new ArrayList<>();
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
}
