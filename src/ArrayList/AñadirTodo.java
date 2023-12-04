package ArrayList;

import java.util.ArrayList;

public class AñadirTodo {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        ArrayList<Integer> numerosDos = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numerosDos.add(6);
        numerosDos.add(7);

        numerosDos.addAll(numeros);

        for (int i:numerosDos
             ) {
            System.out.println(i);
        }
    }
}
