package Mapas;

import java.util.*;

public class Terminacion {
    public static void main(String[] args) {
        //OK
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> ultimaTerminacion = new HashMap<>();
        String boleto;
        List<String> boletos = new ArrayList<>();
        System.out.println("Dame boletos de la loteria");
        boleto = sc.nextLine();
        while(!boleto.isEmpty()){
            boletos.add(boleto);
            boleto = sc.nextLine();
        }

        terminacion(ultimaTerminacion,boletos);
        System.out.println(ultimaTerminacion);
    }

    public static void terminacion(Map<String,Integer> ultimaTerminacion,List<String> boletos){
        for (String boleto:boletos
             ) {
            String ultimaLetra = boleto.charAt(boleto.length() - 1) +"";
            if(ultimaTerminacion.containsKey(ultimaLetra)){
                int contador = ultimaTerminacion.get(ultimaLetra) + 1;
                ultimaTerminacion.replace(ultimaLetra,contador);
            }
            ultimaTerminacion.put(ultimaLetra,ultimaTerminacion.getOrDefault(ultimaLetra,1));

        }
    }
}
