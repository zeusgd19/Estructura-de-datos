package ArrayList;

import java.util.Scanner;

public class Utilidades {

    static Scanner inputValue = new Scanner(System.in);

    public static int cualEsElMasGrande(int num1, int num2) {
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static int cuantosPositivos(int[] numeros){
        int positivos = 0;
        for(int numero:numeros){
            if(numero >= 0){
                positivos++;
            }
        }
        return positivos;
    }

    public static double notaMedia(int[] notas){
        double sumaNotas = 0;

        for(int nota:notas){
            sumaNotas+=nota;
        }
        return sumaNotas / notas.length;
    }

    public static boolean hayDiez(int [] notas){
        boolean hayDiez = false;
        for(int nota:notas){
            if(nota == 10){
                hayDiez = true;
                break;
            }
        }
        return hayDiez;
    }

    public static boolean valorMasGrande(int num1, int num2) {
        return (num1 > num2);
    }
    public static String convertirEnLetra(int nota) {
        String notaEnLetra = "";
        // Si las condiciones son mutuamente excluyentes, se usa if .. else if ...
        if ((nota < 0) || (nota > 10)) {
            notaEnLetra =  "Nota inválida";
        } else if (nota < 3) {
            notaEnLetra =  "Muy deficiente";
        } else if (nota < 5) {
            // No hace falta que comprobemos que es mayor que 3, porque si lo fuera
            // habría entrado por el if (nota < 3) {
            notaEnLetra =  "Insuficiente";
        } else if (nota < 6) {
            notaEnLetra =  "Suficiente";
        } else if (nota < 7) {
            notaEnLetra =  "Bien";
        } else if (nota < 9) {
            return "Notable";
        } else {
            notaEnLetra =  "Sobresaliente";
        }
        return notaEnLetra;
    }

    public static boolean esPositivo(int num) {
        return (num >= 0);
    }

    public static int leerEntero(String mensaje) {

        System.out.println(mensaje);

        return inputValue.nextInt();

    }

    public static double leerDoble(String mensaje) {

        System.out.println(mensaje);

        return inputValue.nextDouble();

    }


    public static char leerCaracter(String mensaje) {

        System.out.println(mensaje);

        // Leemos toda una cadena

        String cadena = inputValue.next();

        // y nos quedamos con el carácter 0 (el primero)

        char op = cadena.charAt(0);

        return op;

    }

    public static String leerCadena(String mensaje) {

        System.out.println(mensaje);

        return inputValue.nextLine();
    }


    public static void rellenaArray(int[] array, int min, int max) {


        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);

            array[i] = aleatorio;
        }

    }


    public static String[] dividirEnPalabras(String cadena){

        // Quitar espacios en blanco al principio y al final
        cadena=cadena.trim();
        // Reemplazar uno o más espacios en blanco por un solo espacio

        cadena=cadena.replaceAll(" +", " ");

        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)

        return cadena.split(" ");
    }




    public static void rellenaMatriz(int[][] matriz, int min, int max){

        // Producir nuevo int aleatorio entre 0 y (max-1)

        int filas = matriz.length;

        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++){

            for (int j = 0; j < columnas; j++){
                matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);

            }

        }

    }

    public static void 	mostrarMatriz(int matriz[][]) {

        int i,j;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Recorrido de las filas de la matriz
        for (i=0; i < filas; i++) {
            // Recorrido de las celdas de una fila
            for (j=0; j<columnas; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j] );

            }


        }

    }

}

