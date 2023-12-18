package Mapas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCountries {

    public static void paises(Map<String,Integer> paises,String line){
        String [] info;
        String pais;

        info = line.split(",");
        pais = info[6];
        if(paises.containsKey(pais)){
            int contar = paises.get(pais) + 1;
            paises.replace(pais,contar);
        } else {
            paises.put(pais,1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        String line;

        boolean primeraLinea = true;
        Map<String,Integer> paises = new LinkedHashMap<>();
        while ((line = reader.readLine())!=null) {
            if(primeraLinea){
                primeraLinea = false;
                continue;
            }
            paises(paises,line);
        }

        for (String clave: paises.keySet()
             ) {
            System.out.println(clave + " " + paises.get(clave));
        }
        reader.close();
    }
}
