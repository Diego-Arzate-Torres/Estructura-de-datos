package reto9.utils;
import reto9.utils.vertice;
/**
 * Esta clase representa una arista en un grafo. Una arista es una conexión entre dos vértices.
 */
public class arista {
    /**
     * El vértice origen de la arista.
     */
    private final vertice v1;

    /**
     * El vértice destino de la arista.
     */
    private final vertice v2;

    /**
     * La ponderación o peso de la arista.
     */
    private final double weight;

    /**
     * Constructor que inicializa la arista con sus vértices y peso.
     * @param v1 El vértice origen de la arista.
     * @param v2 El vértice destino de la arista.
     * @param weight La ponderación o peso de la arista.
     */
    public arista(vertice v1, vertice v2, double weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    /**
     * Método para obtener el vértice origen de la arista.
     * @return El vértice origen de la arista.
     */
    public vertice getV1() {
        return v1;
    }

    /**
     * Método para obtener el vértice destino de la arista.
     * @return El vértice destino de la arista.
     */
    public vertice getV2() {
        return v2;
    }

    /**
     * Método para obtener el peso de la arista.
     * @return El peso de la arista.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Método toString personalizado para una representación bonita de la arista.
     * @return Una cadena que representa a la arista, incluyendo los nombres de los vértices y el peso de la arista.
     */
    @Override
    public String toString() {
        return "Arista{" +
                "v1=" + v1.getNombre() +
                ", v2=" + v2.getNombre() +
                ", weight=" + weight +
                '}';
    }
}
