package Mapas;

import java.util.*;

public class TelefonosII {
    public static void main(String[] args) {
        //OK
        HashMap<String, ArrayList<String>> contactos = new HashMap<>();

        contactos.put("Miguel",new ArrayList<>(Arrays.asList("645984182","690283891")));
        contactos.put("Antonio",new ArrayList<>(Arrays.asList("634891327","658340218")));
        contactos.put("Pepe",new ArrayList<>(Arrays.asList("643817367","674830291")));
        contactos.put("Darius",new ArrayList<>(Arrays.asList("678901323","683492021")));
        contactos.put("Ismael",new ArrayList<>(Arrays.asList("623893674","647389148")));
        contactos.put("Maria",new ArrayList<>(Arrays.asList("694276579","643890210")));
        contactos.put("Alex",new ArrayList<>(Arrays.asList("629321942","684320216")));
        contactos.put("Ramon",new ArrayList<>(Arrays.asList("632012439","634292430")));
        contactos.put("Marcos",new ArrayList<>(Arrays.asList("647832129","647329123")));

        Scanner sc = new Scanner(System.in);
        String contacto;
        String telefonos = "";
        System.out.println("Dime contactos y te dire sus telefonos");
        contacto = sc.nextLine();
        while(!contacto.isEmpty()){
            telefonos += contactos.getOrDefault(contacto,new ArrayList<>(Arrays.asList("No esta en la lista"))) + "\n";
            contacto = sc.nextLine();
        }
        System.out.println(telefonos);
    }
}
