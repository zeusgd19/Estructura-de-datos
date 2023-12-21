package Mapas;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ligapadel {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        String categoria;
        String equipoLocal;
        String equipoVisitante;
        String puntos;
        String puntoVisitante;
        categoria = sc.nextLine();
        int inicioLocal;
        int inicioVisitante;
        int contarPartidos = 0;

        while (!categoria.equals("FIN")) {
            equipoLocal = sc.next();
            if (equipoLocal.equals("FIN")) {
                System.out.println(ganadores(mapa, contarPartidos));
                categoria = sc.next();
                if (categoria.equals("FIN")) {
                    break;
                } else {
                    contarPartidos = 0;
                    mapa = new LinkedHashMap<>();
                }
                equipoLocal = sc.next();
            }
            puntos = sc.next();
            equipoVisitante = sc.next();
            puntoVisitante = sc.nextLine();
            if (Integer.parseInt(puntos) > Integer.parseInt(puntoVisitante.trim())) {
                if (mapa.get(equipoLocal) == null) {
                    mapa.put(equipoLocal, 0);
                }
                if (mapa.get(equipoVisitante) == null) {
                    mapa.put(equipoVisitante, 0);
                }
                inicioLocal = mapa.get(equipoLocal) + 2;
                inicioVisitante = mapa.get(equipoVisitante) + 1;
                mapa.put(equipoLocal, inicioLocal);
                mapa.put(equipoVisitante, inicioVisitante);

            } else if (Integer.parseInt(puntos) < Integer.parseInt(puntoVisitante.trim())) {
                if (mapa.get(equipoLocal) == null) {
                    mapa.put(equipoLocal, 0);
                }
                if (mapa.get(equipoVisitante) == null) {
                    mapa.put(equipoVisitante, 0);
                }
                inicioLocal = mapa.get(equipoLocal) + 1;
                inicioVisitante = mapa.get(equipoVisitante) + 2;
                mapa.put(equipoLocal, inicioLocal);
                mapa.put(equipoVisitante, inicioVisitante);

            }
            contarPartidos++;
        }


    }

    public static String ganadores(Map<String, Integer> mapa, int partidos) {
        int mayor = -1;
        String equipoGanador = "";
        int contarEquipos = 0;
        int partidosTotales;
        String ganadores = "";
        for (String equipo : mapa.keySet()
        ) {
            contarEquipos++;
            if (mapa.get(equipo) > mayor) {
                mayor = mapa.get(equipo);
                equipoGanador = equipo;
            } else if (mapa.get(equipo) == mayor) {
                equipoGanador = "EMPATE";
            }
        }
        partidosTotales = (contarEquipos * (contarEquipos - 1));
        ganadores += equipoGanador + " " + (partidosTotales == partidos ? 0 : (partidosTotales - partidos));

        return ganadores;
    }
}
