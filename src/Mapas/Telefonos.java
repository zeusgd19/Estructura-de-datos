package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String,String> contactos = new HashMap<>();

        contactos.put("Miguel","645984182");
        contactos.put("Antonio","634891327");
        contactos.put("Pepe","643817367");
        contactos.put("Darius","678901323");
        contactos.put("Ismael","623893674");
        contactos.put("Maria","694276579");
        contactos.put("Alex","629321942");
        contactos.put("Ramon","632012439");
        contactos.put("Marcos","647832129");

        Scanner sc = new Scanner(System.in);
        String contacto;
        String telefonos = "";
        System.out.println("Dime contactos y te dire sus telefonos");
        contacto = sc.nextLine();
        while(!contacto.isEmpty()){
            telefonos += contactos.getOrDefault(contacto,"No esta en la lista") + "\n";
            contacto = sc.nextLine();
        }
        System.out.println(telefonos);
    }
}
