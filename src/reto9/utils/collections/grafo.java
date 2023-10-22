package reto9.utils.collections;

import reto9.utils.arista;
import reto9.utils.vertice;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta clase representa un grafo. Un grafo es una estructura de datos que consiste en vértices y aristas.
 */
public class grafo {
    /**
     * Mapa que almacena los vértices del grafo.
     */
    public final HashMap<String, vertice> vertice;

    /**
     * Constructor de la clase grafo. Inicializa el mapa de vértices.
     */
    public grafo() {
        this.vertice = new HashMap<>();
    }

    /**
     * Método para agregar un vértice al grafo.
     * @param nombre El nombre del vértice a agregar.
     */
    public void addVertice(String nombre) {
        this.vertice.put(nombre, new vertice(nombre));
    }

    /**
     * Método para obtener un vértice del grafo.
     * @param nombre El nombre del vértice a obtener.
     * @return El vértice si se encuentra, null en caso contrario.
     */
    public vertice getVertice(String nombre) {
        for (vertice v : this.vertice.values()) {
            if (v.getNombre().equals(nombre)) {
                return v;
            }
        }
        return null;  // Retorna null si no se encuentra el vértice
    }

    /**
     * Método para agregar una arista al grafo.
     * @param v1 El primer vértice de la arista.
     * @param v2 El segundo vértice de la arista.
     * @param weight El peso de la arista.
     */
    public void addArista(String v1, String v2, double weight) {
        vertice vertice1 = this.vertice.get(v1);
        vertice vertice2 = this.vertice.get(v2);

        if (vertice1 == null) {
            vertice1 = new vertice(v1);
            this.vertice.put(v1, vertice1);
        }

        if (vertice2 == null) {
            vertice2 = new vertice(v2);
            this.vertice.put(v2, vertice2);
        }

        arista newArista = new arista(vertice1, vertice2, weight);
        vertice1.addArista(newArista); // Asume que tienes un método addArista en tu clase Vertice
    }

    /**
     * Método para obtener las adyacencias de un vértice.
     * @param nombreVertice El nombre del vértice cuyas adyacencias se quieren obtener.
     * @return Una lista con las adyacencias del vértice si se encuentra, null en caso contrario.
     */
    public ArrayList<arista> getAdyacencias(String nombreVertice) {
        vertice vertice = this.vertice.get(nombreVertice);
        return vertice != null ? vertice.getAristas() : null; // Asume que tienes un método getAristas en tu clase Vertice
    }
}


