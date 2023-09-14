package edu.diego.arzate.torres.Modulo1.tarea2.utils;

import java.util.Optional;

public class Node <E>{
    public String jugador;
    public Node siguiente;
    public E data;
    public Optional<Node<E>> next;

    public Node(E data) {
        this.data = data;
        next = Optional.empty();
        this.jugador = jugador;
        this.siguiente = null;
    }
}
