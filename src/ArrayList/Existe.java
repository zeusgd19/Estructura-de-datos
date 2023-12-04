package ArrayList;

import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int numero = 4;

        if(existe(numeros,numero)){
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }

    public static boolean existe(ArrayList<Integer> numeros,int numero){
        if(numeros.contains(numero)) {
            return true;
        } else {
            return false;
        }
    }
}
