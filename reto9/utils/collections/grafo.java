package edu.diego.arzate.torres.modulo2.reto9.utils.collections;

import edu.diego.arzate.torres.modulo2.reto9.utils.arista;
import edu.diego.arzate.torres.modulo2.reto9.utils.vertice;

import java.util.ArrayList;
import java.util.HashMap;

public class grafo {
    public final HashMap<String, vertice> vertice;

    public grafo() {
        this.vertice = new HashMap<>();
    }

    public void addVertice(String nombre) {
        this.vertice.put(nombre, new vertice(nombre));
    }

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

    public ArrayList<arista> getAdyacencias(String nombreVertice) {
        vertice vertice = this.vertice.get(nombreVertice);
        return vertice != null ? vertice.getAristas() : null; // Asume que tienes un método getAristas en tu clase Vertice
    }
}


