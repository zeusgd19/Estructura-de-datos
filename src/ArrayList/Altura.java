package ArrayList;

import java.util.ArrayList;
public class Altura {

    public static void main(String[] args) {
        //OK
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        double media = calcularMedia(alturas);
        mostrarResultados(alturas,media);
    }
    public static int numeroAlumnos(){
        return Utilidades.leerEntero("Cuántos alumnos?");
    }

    public static ArrayList<Double> leerAlturas(int numAlumnos){
        ArrayList<Double> alturas = new ArrayList<Double>();
        System.out.printf("Introduzca las %d alturas", numAlumnos);
        for (int i = 1; i <= numAlumnos; i++){
            alturas.add(Utilidades.leerDoble(""));
        }
        return alturas;
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        double suma = 0.0;
        double media;
        for (double altura: alturas){
            suma+= altura;
        }
        media = suma / alturas.size();
        return media;
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media){
        int contador = 0;
        for (Double altura: alturas){
            if (altura > media)
                contador++;
        }
        return contador;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media){
        int contador = 0;
        for (Double altura: alturas){
            if (altura < media)
                contador++;
        }
        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas,double media){
        int superior = calcularAlumnosAlturaSuperior(alturas, media);
        int inferior = calcularAlumnosAlturaInferior(alturas, media);

        System.out.println("Las alturas son las siguientes:");
        for(Double altura: alturas) {
            System.out.print(altura + ", ");
        }

        System.out.println("");
        System.out.printf("La altura media es %f%n", media);

        System.out.printf("El número de alummos con una altura superior es %d%n", superior);
        System.out.printf("El número de alummos con una altura inferior es %d%n", inferior);
    }
}

