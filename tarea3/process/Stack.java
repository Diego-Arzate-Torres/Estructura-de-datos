package edu.diego.arzate.torres.Modulo1.tarea3.process;

import edu.diego.arzate.torres.Modulo1.tarea3.utils.ListaEnlazada;
import edu.diego.arzate.torres.Modulo1.tarea3.utils.Node;

import java.util.Optional;

/**
 * Esta clase representa una estructura de datos de tipo Pila.
 * @param <E> el tipo de elementos en esta Pila
 */
public class Stack <E>  {

    /**
     * La lista subyacente utilizada para implementar la Pila.
     */
    public ListaEnlazada<E> lista= new ListaEnlazada<>();

    /**
     * Verifica si la Pila está vacía.
     * @return verdadero si la Pila está vacía, falso en caso contrario
     */
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    /**
     * Elimina y devuelve el elemento superior de la Pila.
     * @return un Optional que contiene el elemento superior de la Pila, o un Optional vacío si la Pila está vacía
     */
    public Optional<E> pop() {
        if (lista.size()!=0) {
            Optional<E> removedData = lista.get(0);
            lista.removeFirst();
            return removedData;
        }
        return Optional.empty();
    }


    /**
     * Devuelve el elemento superior de la Pila sin eliminarlo.
     * @return un Optional que contiene el elemento superior de la Pila, o un Optional vacío si la Pila está vacía
     */
    public Optional<E> peek() {
        if (lista.size()!=0) {
            return lista.get(0);
        }
        return Optional.empty();
    }


    /**
     * Empuja un elemento en la parte superior de la Pila.
     * @param element el elemento a ser empujado en la parte superior de la Pila
     * @throws IllegalArgumentException si el elemento es nulo
     */
    public void push(E element){
        if (element == null) {
            throw new IllegalArgumentException("el elemento no puede ser nulo");
        } else {
            lista.add(element);
        }
    }

    /**
     * Devuelve el tamaño de la Pila.
     * @return el tamaño de la Pila
     */
    public int size() {
        return lista.size();
    }

    /**
     * Invierte el orden de los elementos en la Pila.
     */
    public void inverse() {
        ListaEnlazada<E> temp = new ListaEnlazada<>();
        while (!lista.isEmpty()) {
            temp.add(lista.removeFirst());
        }
        lista = temp;
    }

    /**
     * Alterna elementos de esta Pila y otra Pila en esta Pila.
     * @param Pila2 la otra Pila a alternar con esta
     */
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

