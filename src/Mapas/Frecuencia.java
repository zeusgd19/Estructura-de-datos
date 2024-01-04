package Mapas;

import java.util.*;

public class Frecuencia {
    public static void main(String[] args) {
        //OK
        Map<String,Integer> frecuencia = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String palabra;
        palabra = sc.nextLine();
        List<String> palabras = new ArrayList<>();
        while (!palabra.isEmpty()){
            palabras.add(palabra);
            palabra = sc.nextLine();
        }

        
        contar(frecuencia,palabras);
        for (String clave:frecuencia.keySet()
             ) {
            System.out.println(clave + " - " + frecuencia.get(clave));
        }
    }
    public static void contar(Map<String,Integer> frencuencia, List<String> palabras){
        for (String palabra:palabras
        ) {
            if(frencuencia.containsKey(palabra)){
                int contador = frencuencia.get(palabra) + 1;
                frencuencia.replace(palabra,contador);
            }
            frencuencia.put(palabra,frencuencia.getOrDefault(palabra,1));
        }
    }
}
