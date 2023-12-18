package Mapas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagrama {

    public static void anagrama(Map<String, ArrayList<String>> mapa,String line){
        char[] letras;
        ArrayList<String> lista;

        letras = line.toCharArray();
        Arrays.sort(letras);
        String palabraOrdenada = new String(letras);

        if (mapa.containsKey(palabraOrdenada)) {
            lista = mapa.get(palabraOrdenada);
            lista.add(line);
            mapa.replace(palabraOrdenada,lista);
        } else {
            lista = new ArrayList<>();
            mapa.put(palabraOrdenada, lista);
        }
    }

    public static void main(String[] args) throws IOException {
        int minGroupSize = 5;
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("spanish-dict.txt"));
        String line;

        while ((line = reader.readLine())!=null) {
            anagrama(mapa,line);

        }
        for (String clave:mapa.keySet()
             ) {
            if(mapa.get(clave).size() >= minGroupSize) {
                System.out.println(clave + mapa.get(clave));
            }
        }
        reader.close();
    }
}
