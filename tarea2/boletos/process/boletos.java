package edu.diego.arzate.torres.Modulo1.tarea2.boletos.process;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase boletos representa una lista de pasajeros.
 */
public class boletos {
    private List<String> pasajeros;
    /**
     * Constructor de la clase boletos.
     */
    public boletos() {
        this.pasajeros = new ArrayList<>();
    }
    /**
     * Agrega un pasajero a la lista de pasajeros.
     *
     * @param pasajero El nombre del pasajero a agregar.
     */
    public void agregarPasajero(String pasajero) {
        this.pasajeros.add(pasajero);
    }
    /**
     * Elimina un pasajero de la lista de pasajeros.
     *
     * @param pasajero El nombre del pasajero a eliminar.
     */
    public void eliminarPasajero(String pasajero) {
        this.pasajeros.remove(pasajero);
    }
    /**
     * Devuelve el nombre del pasajero en el índice especificado.
     *
     * @param index El índice del pasajero a visualizar.
     * @return El nombre del pasajero en el indice especificado, o "Indice fuera de rango" si el índice es invalido.
     */
    public String visualizarPasajero(int index) {
        if (index >= 0 && index < this.pasajeros.size()) {
            return this.pasajeros.get(index);
        } else {
            return "Indice fuera de rango";
        }
    }
}
