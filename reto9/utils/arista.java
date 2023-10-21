package edu.diego.arzate.torres.modulo2.reto9.utils;
import edu.diego.arzate.torres.modulo2.reto9.utils.vertice;
public class arista {
    private final vertice v1; // Vertice origen
    private final vertice v2; // Vertice destino
    private final double weight; // Ponderacion o peso de la arista

    // Constructor que inicializa la arista con sus vertices y peso
    public arista(vertice v1, vertice v2, double weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    // Método para obtener el vertice origen
    public vertice getV1() {
        return v1;
    }

    // Método para obtener el vertice destino
    public vertice getV2() {
        return v2;
    }

    // Método para obtener el peso de la arista
    public double getWeight() {
        return weight;
    }

    // Método toString personalizado para una representación bonita de la arista
    @Override
    public String toString() {
        return "Arista{" +
                "v1=" + v1.getNombre() +
                ", v2=" + v2.getNombre() +
                ", weight=" + weight +
                '}';
    }
}
