package Mapas;

import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ligapadel {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> partidos = new ArrayList<>();

        String categoria;
        String equipoLocal;
        String equipoVisitante;
        String puntos;
        String puntoVisitante;
        categoria = sc.nextLine();
        int inicioLocal;
        int inicioVisitante;
        int categorias = 1;
        int partido = 0;
        int contarPartidos = 0;
        int defecto = 0;
        partidos.add(partido);
        while(!categoria.equals("FIN")){
            equipoLocal = sc.next();
            if(equipoLocal.equals("FIN")){
                categoria = sc.next();
                if(categoria.equals("FIN")){
                    break;
                } else {
                    categorias++;
                    contarPartidos = 0;
                    partido = 0;
                    partidos.add(partido);
                    mapa.put(categoria,-1);
                }
                equipoLocal = sc.next();
            }
            puntos = sc.next();
            mapa.put(equipoLocal, mapa.getOrDefault(equipoLocal, defecto));
            equipoVisitante = sc.next();
            puntoVisitante = sc.nextLine();
            mapa.put(equipoVisitante, mapa.getOrDefault(equipoVisitante, defecto));
            if(Integer.parseInt(puntos) > Integer.parseInt(puntoVisitante.trim())){
                inicioLocal = mapa.get(equipoLocal) + 2;
                inicioVisitante = mapa.get(equipoVisitante) + 1;

            } else {
                inicioLocal = mapa.get(equipoLocal) + 1;
                inicioVisitante = mapa.get(equipoVisitante) + 2;

            }
            mapa.replace(equipoLocal,inicioLocal);
            mapa.replace(equipoVisitante,inicioVisitante);
            contarPartidos++;
            partidos.set(partidos.indexOf(partido),contarPartidos);
            partido = contarPartidos;
        }

        System.out.println(ganadores(categorias,mapa,partidos));

    }
    public static String ganadores(int categorias, Map<String,Integer> mapa,ArrayList<Integer> partidos){
        int mayor = -1;
        String equipoGanador = "";
        String excluye = null;
        int contarEquipos = 0;
        int partidosTotales;
        String ganadores = "";
        for (int j = 0; j < categorias; j++) {
            boolean encontrado = false;
            for (String equipo:mapa.keySet()
            ) {
                if(excluye !=null && !excluye.equals(equipo) && !encontrado){
                    continue;
                }

                if(excluye !=null && excluye.equals(equipo)){
                    encontrado = true;
                    continue;
                }


                if(mapa.get(equipo) != -1) {
                    contarEquipos++;
                    if (mapa.get(equipo) > mayor) {
                        mayor = mapa.get(equipo);
                        equipoGanador = equipo;
                    } else if(mapa.get(equipo) == mayor){
                        equipoGanador = "EMPATE";
                    }
                } else {
                    excluye = equipo;
                    mayor = -1;
                    break;
                }
            }
            partidosTotales = (contarEquipos * (contarEquipos - 1));
            ganadores += equipoGanador + " " + (partidosTotales == partidos.get(j) ? 0:(partidosTotales - partidos.get(j))) + "\n";
            contarEquipos = 0;
        }
        return ganadores;
    }
}
