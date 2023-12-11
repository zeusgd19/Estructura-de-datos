package Mapas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class tecladoEstropeado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> mapa = new LinkedHashMap<>();
        String cadena;
        cadena = sc.nextLine();

        while(!cadena.isEmpty()){
            mapa.put(cadena,"");
            cadena = sc.nextLine();
        }
        System.out.println(resultado(mapa));
    }

    public static String resultado (Map<String,String> mapa){
        String caracter;
        int guardarPosicion;
        String valores = "";
        String claveOriginal;
        for (String clave:mapa.keySet()
             ) {
            claveOriginal = clave;
            for (int i = 0; i < clave.length(); i++) {
                if(clave.charAt(i) == '-'){
                    clave = clave.substring(0,i) + "" + clave.substring(i+1);
                    guardarPosicion = i;
                    i = 0;
                    for (int j = guardarPosicion; j < clave.length(); j++) {
                        switch (clave.charAt(j)){
                            case '3':
                                clave = clave.substring(0,i) + "" + clave.substring(i+1);
                                j--;
                                clave = clave.substring(0,j) + "" + clave.substring(j+1);
                                j--;
                                break;
                            case '*':
                                i = i+1;
                                clave = clave.substring(0,j) + "" + clave.substring(j+1);
                                j--;
                                break;
                            case '+':
                                clave = clave.substring(0,j) + "" + clave.substring(j+1);
                                i = clave.length() - 1;
                                j--;
                                break;
                            case '-':
                                i = 0;
                                clave = clave.substring(0,j) + "" + clave.substring(j+1);
                                j--;
                                break;
                            default:
                                caracter = clave.charAt(i) + "";
                                clave = clave.substring(0,i) + clave.charAt(j) + clave.substring(i+1);
                                if(!caracter.equals(clave.charAt(i) + "")) {
                                    clave = clave.substring(0,j) + "" + clave.substring(j+1);
                                    clave = clave.substring(0, i + 1) + caracter + clave.substring(i + 1);
                                }
                                i++;
                                break;
                        }
                    }
                } else if (clave.charAt(i) == '3' || clave.charAt(i) == '+' || clave.charAt(i) == '*'){
                    clave=clave.substring(0,i) + "" + clave.substring(i + 1);
                    i--;
                }
            }
            mapa.replace(claveOriginal,clave);
        }
        for (String valor:mapa.values()
             ) {
            valores+=valor + "\n";
        }

        return valores;

    }
}
