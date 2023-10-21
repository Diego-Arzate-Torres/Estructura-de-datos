package edu.diego.arzate.torres.modulo2.reto9.utils;

import java.util.Objects;

import java.util.ArrayList;
import java.util.Objects;

public  class vertice {
    private String nombre;
    private ArrayList<arista> aristas;

    public vertice(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addArista(arista arista) {
        this.aristas.add(arista);
    }

    public ArrayList<arista> getAristas() {
        return aristas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof vertice)) return false;
        vertice vertice = (vertice) o;
        return getNombre().equals(vertice.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
