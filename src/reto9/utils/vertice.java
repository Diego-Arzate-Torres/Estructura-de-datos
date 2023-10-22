package reto9.utils;

import java.util.List;
import java.util.Objects;

import java.util.ArrayList;
import java.util.Objects;
/**
 * Esta clase representa un vértice en un grafo. Un vértice tiene un nombre y una lista de aristas.
 */
public  class vertice {
    /**
     * El nombre del vértice.
     */
    private String nombre;
    /**
     * La lista de aristas del vértice.
     */
    private ArrayList<arista> aristas;
    /**
     * Constructor que inicializa el vértice con su nombre.
     * @param nombre El nombre del vértice.
     */
    public vertice(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
    }
    /**
     * Método para obtener los vecinos del vértice.
     * @return Una lista con los vecinos del vértice.
     */
    public List<vertice> getVecinos() {
        List<vertice> vecinos = new ArrayList<>();
        for (arista arista : this.aristas) {
            vecinos.add(arista.getV2());
        }
        return vecinos;
    }
    /**
     * Método para obtener el nombre del vértice.
     * @return El nombre del vértice.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método para agregar una arista al vértice.
     * @param arista La arista a agregar.
     */
    public void addArista(arista arista) {
        this.aristas.add(arista);
    }
    /**
     * Método para obtener las aristas del vértice.
     * @return Una lista con las aristas del vértice.
     */
    public ArrayList<arista> getAristas() {
        return aristas;
    }
    /**
     * Método para comparar la igualdad de dos objetos de la clase vertice.
     * @param o El objeto a comparar con el vértice actual.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof vertice)) return false;
        vertice vertice = (vertice) o;
        return getNombre().equals(vertice.getNombre());
    }
    /**
     * Método para obtener el código hash del vértice.
     * @return El código hash del vértice.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
    /**
     * Método toString personalizado para una representación bonita del vértice.
     * @return Una cadena que representa al vértice, incluyendo su nombre.
     */
    @Override
    public String toString() {
        return "Vertice{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
