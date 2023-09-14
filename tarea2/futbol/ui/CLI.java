package edu.diego.arzate.torres.Modulo1.tarea2.futbol.ui;

import edu.diego.arzate.torres.Modulo1.tarea2.futbol.ListaEnlazada;
import edu.diego.arzate.torres.Modulo1.tarea2.futbol.process.proceso;

import java.util.*;

/**
 * La clase CLI proporciona métodos para interactuar con el usuario a través de la línea de comandos.
 */
public class CLI {
    /**
     * Permite al usuario seleccionar un jugador de una lista de jugadores disponibles.
     *
     * @param jugadoresDisponibles ListaEnlazada de jugadores disponibles para seleccionar.
     * @return El nombre del jugador seleccionado por el usuario.
     */
    public static String seleccionarJugador(ListaEnlazada jugadoresDisponibles) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingresa el nombre del jugador que deseas seleccionar: ");
            String nombreJugador = sc.nextLine();
            if (jugadoresDisponibles.add(nombreJugador)) {
                return nombreJugador;

            }else {
                System.out.println("El jugador no existe o ya ha sido seleccionado. Inténtalo de nuevo.");
            }
        }
    }
    /**
     * Imprime los nombres de los jugadores en dos equipos.
     *
     * @param equipo1 ListaEnlazada con los nombres de los jugadores en el equipo 1.
     * @param equipo2 ListaEnlazada con los nombres de los jugadores en el equipo 2.
     */
    public static void imprimirEquipos(ListaEnlazada equipo1, ListaEnlazada equipo2) {
        System.out.println("Equipo 1: " + equipo1.toString());
        System.out.println("Equipo 2: " + equipo2.toString());
    }
    /**
     * Pide al usuario que ingrese el nombre del capitán del equipo.
     *
     * @param numeroCapitan El número del capitán (1 o 2).
     * @return El nombre del capitán ingresado por el usuario.
     */
    public static String pedirNombreCapitan(int numeroCapitan) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del capitán " + numeroCapitan + ": ");
        return sc.nextLine();
    }
    /**
     * Pide al usuario que ingrese los nombres de 20 jugadores.
     *
     * @return Una ListaEnlazada con los nombres de los jugadores ingresados por el usuario.
     */
    public static ListaEnlazada<String> pedirNombresJugadores() {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada<String> jugadores = new ListaEnlazada<>();
        for (int i=0; i<20; i++) {
            System.out.print("Ingresa el nombre del jugador " + (i+1) + ": ");
            jugadores.add(sc.nextLine());
        }
        return jugadores;
    }
    /**
     * Inicia un partido, pidiendo al usuario que ingrese los nombres de los capitanes y jugadores y seleccionando a los jugadores para cada equipo.
     */
    public static void iniciarPartido() {
        String nombreCapitan1 = CLI.pedirNombreCapitan(1);
        String nombreCapitan2 = CLI.pedirNombreCapitan(2);
        ListaEnlazada equipo1 = new ListaEnlazada();
        ListaEnlazada equipo2 = new ListaEnlazada();
        equipo1.add(nombreCapitan1);
        equipo2.add(nombreCapitan2);
        ListaEnlazada<String> jugadoresDisponibles = CLI.pedirNombresJugadores();
        System.out.println("Turno del capitán 1 para seleccionar jugadores.");
        equipo1 = proceso.seleccionarJugadores(jugadoresDisponibles);
        System.out.println("Turno del capitán 2 para seleccionar jugadores.");
        equipo2 = proceso.seleccionarJugadores(jugadoresDisponibles);
        CLI.imprimirEquipos(equipo1, equipo2);
    }


}
