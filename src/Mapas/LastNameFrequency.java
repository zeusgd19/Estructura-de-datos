package Mapas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class LastNameFrequency {

    public static void apellidos(Map<String,String> apellidos,String line){
        String[] apellidosFrecuencia;

        if(!line.isEmpty()) {
            apellidosFrecuencia = line.split(",");
            apellidos.put(apellidosFrecuencia[0], apellidosFrecuencia[1]);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("LastnameFrequencies.csv"));
        String line;
        Map<String,String> apellidos = new LinkedHashMap<>();

        while ((line = reader.readLine())!=null) {
            apellidos(apellidos,line);
        }

        for (String clave:apellidos.keySet()
             ) {
            System.out.println(clave + " " + apellidos.get(clave));
        }
        reader.close();
    }
}
