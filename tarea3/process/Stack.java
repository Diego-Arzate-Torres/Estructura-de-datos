package edu.diego.arzate.torres.Modulo1.tarea3.process;

import edu.diego.arzate.torres.Modulo1.tarea3.utils.Node;
import edu.diego.arzate.torres.Modulo1.tarea3.utils.ListaEnlazada;

import java.util.Optional;

public class Stack <E>  {

    public ListaEnlazada<E> lista= new ListaEnlazada<>();

    public boolean isEmpty() {
        return lista.isEmpty();
    }
    public Optional<E> pop(){
        if (lista.isEmpty()) {
            // Si la lista está vacía, devuelve Optional.empty().
            return Optional.empty();
        } else {
            // Si la lista no está vacía, elimina el primer elemento y lo devuelve envuelto en un objeto Optional.
            E element = lista.removeFirst();
            return Optional.ofNullable(element);
        }
    }
    public Optional<E> peek() {
        return lista.peek();
    }

    public void push(E element){
        if (element == null) {
            throw new IllegalArgumentException("el elemento no puede ser nullo");
        } else {
            lista.add(element);
        }
    }
    public int size() {
            return lista.size();
        }

    public void inverse() {
        ListaEnlazada<E> temp = new ListaEnlazada<>();
        while (!lista.isEmpty()) {
            temp.add(lista.removeFirst());
        }
        lista = temp;
    }

    public void Alternate(Stack<E> Pila2) {
        ListaEnlazada<E> temp = new ListaEnlazada<>();
        while (!lista.isEmpty() || !Pila2.lista.isEmpty()) {
            if (!lista.isEmpty()) {
                temp.add(lista.removeFirst());
            }
            if (!Pila2.lista.isEmpty()) {
                temp.add(Pila2.lista.removeFirst());
            }
        }
        lista = temp;
    }
}
// TODO la práctica les requiere de otros dos métodos que no incluyo aquí pero que si son parte de la entrega

