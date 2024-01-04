package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        //OK
        Map<String,String> paises = new HashMap<>();

        paises.put("España","Madrid");
        paises.put("Portugal","Lisboa");
        paises.put("Francia","Paris");
        paises.put("Italia","Roma");
        paises.put("Ucrania","Kiev");
        paises.put("Alemania","Berlin");
        paises.put("Polonia","Varsovia");
        paises.put("Grecia","Atenas");
        paises.put("Suecia","Estocolmo");

        Scanner sc = new Scanner(System.in);
        String pais;
        String capitales = "";
        System.out.println("Dime paises y te dire sus capitales");
        pais = sc.nextLine();
        while(!pais.isEmpty()){
            capitales += paises.getOrDefault(pais,"No esta en la lista") + "\n";
            pais = sc.nextLine();
        }
        System.out.println(capitales);
    }
}
