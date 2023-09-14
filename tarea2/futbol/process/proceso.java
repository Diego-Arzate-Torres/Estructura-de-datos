package edu.diego.arzate.torres.Modulo1.tarea2.futbol.process;

import edu.diego.arzate.torres.Modulo1.tarea2.futbol.ListaEnlazada;

import edu.diego.arzate.torres.Modulo1.tarea2.futbol.ui.CLI;
/**
 * La clase proceso proporciona métodos para seleccionar jugadores para un equipo.
 */
public class proceso {
    /**
     * Selecciona 10 jugadores de una lista de jugadores disponibles.
     *
     * @param jugadoresDisponibles ListaEnlazada de jugadores disponibles para seleccionar.
     * @return Una ListaEnlazada con los nombres de los jugadores seleccionados.
     */
    public static ListaEnlazada seleccionarJugadores(ListaEnlazada jugadoresDisponibles) {
        ListaEnlazada jugadoresSeleccionados = new ListaEnlazada();
        for (int i=0; i<10; i++) {
            String jugadorSeleccionado = CLI.seleccionarJugador(jugadoresDisponibles);
            jugadoresSeleccionados.add(jugadorSeleccionado);
            jugadoresDisponibles.remove(jugadorSeleccionado);
        }
        return jugadoresSeleccionados;
    }
}
