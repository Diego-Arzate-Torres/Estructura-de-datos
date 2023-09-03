package edu.diego.arzate.torres.Modulo1.tarea3.utils;

import edu.diego.arzate.torres.Modulo1.tarea3.utils.Lista;
import edu.diego.arzate.torres.Modulo1.tarea3.utils.Node;
import java.util.Optional;

/**
 * La clase ListaEnlazada implementa una lista enlazada genérica.
 *
 * @param <E> El tipo de elementos almacenados en la lista.
 */
public class ListaEnlazada<E> implements Lista<E> {
    Optional<Node<E>> firstNode;

    /**
     * Constructor de la clase ListaEnlazada.
     */
    public ListaEnlazada() {
        this.firstNode = Optional.empty();
    }

    /**
     * Devuelve una representación en cadena de la lista.
     *
     * @return Una representación en cadena de la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Optional<Node<E>> currentNode = firstNode;
        while (currentNode.isPresent()) {
            sb.append(currentNode.get().data);
            currentNode = currentNode.get().next;
            if (currentNode.isPresent()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param e El elemento a agregar.
     * @return Siempre devuelve true.
     */
    @Override
    public boolean add(E e) {
        Optional<Node<E>> newNode = Optional.of(new Node<>(e));
        if (firstNode.isEmpty()) {
            firstNode = newNode;
        } else {
            Optional<Node<E>> currentNode = firstNode;
            while (!currentNode.get().next.isEmpty()) {
                currentNode = currentNode.get().next;
            }
            currentNode.get().next = newNode;
        }
        return true;
    }

    /**
     * Elimina la primera ocurrencia del elemento especificado de la lista, si está presente.
     *
     * @param e El elemento a eliminar.
     */
    @Override
    public void remove(E e) {
        if (firstNode.isPresent() && firstNode.get().data == e) {
            firstNode = firstNode.get().next;
        } else if (firstNode.isPresent()) {
            Optional<Node<E>> nodeRemover = firstNode.get().next;
            Optional<Node<E>> currentNode = firstNode;

            while (nodeRemover.isPresent()) {
                if (nodeRemover.get().data == e) {
                    currentNode.get().next = nodeRemover.get().next;
                    return;
                }
                nodeRemover = nodeRemover.get().next;
                currentNode = currentNode.get().next;
            }
        }
    }

    /**
     * Devuelve el elemento en la posición especificada en la lista.
     *
     * @param index Indice del elemento a devolver.
     * @return El elemento en la posición especificada en la lista, envuelto en un objeto Optional.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango (index < 0 || index >= size()).
     */
    @Override
    public Optional<E> get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        Optional<Node<E>> currentNode = firstNode;
        while (!currentNode.isEmpty()) {
            if (count == index) {
                return Optional.of(currentNode.get().data);
            }
            currentNode = currentNode.get().next;
            count++;
        }
        throw new IndexOutOfBoundsException();
    }

    /**
     * Reemplaza la primera ocurrencia del valor especificado en la lista con el nuevo valor especificado.
     *
     * @param oldValue El valor a reemplazar.
     * @param newValue El valor con el que reemplazar la primera ocurrencia del valor especificado.
     */
    @Override
    public void update(E oldValue, E newValue) {
        Optional<Node<E>> currentNode = firstNode;

        while (!currentNode.isEmpty()) {
            if (currentNode.get().data == oldValue) {
                currentNode.get().data = newValue;
                return;
            }
            currentNode = currentNode.get().next;
        }
    }

    /**
     * Devuelve el número de elementos en la lista.
     *
     * @return El número de elementos en la lista.
     */
    @Override
    public int size() {
        int size = 0;
        Optional<Node<E>> currentNode = firstNode;

        while (!currentNode.isEmpty()) {
            size++;
            currentNode = currentNode.get().next;
        }
        return size;
    }

    /**
     * Devuelve verdadero si la lista contiene el elemento especificado.
     *
     * @param t Elemento cuya presencia en la lista se va a probar.
     * @return Verdadero si la lista contiene el elemento especificado, falso en caso contrario.
     */
    @Override
    public boolean contains(E t) {
        Optional<Node<E>> currentNode = firstNode;
        while (!currentNode.isEmpty()) {
            if (currentNode.get().data == t) {
                return true;
            }
            currentNode = currentNode.get().next;
        }
        return false;
    }
    public E removeFirst() {
        // Verifica si la lista está vacía.
        if (this.isEmpty()) {
            // Si la lista está vacía, devuelve null.
            return null;
        } else {
            // Si la lista no está vacía, obtiene el primer elemento.
            E element = (E) this.getFirst();
            // Elimina el primer elemento de la lista.
            this.remove(element);
            // Devuelve el elemento eliminado.
            return element;
        }
    }
    public Optional<E> peek() {
        if (firstNode.isPresent()) {
            return Optional.of(firstNode.get().data);
        } else {
            return Optional.empty();
        }
    }
    public boolean isEmpty() {
        return firstNode.isEmpty();
    }
    public Optional<E> getFirst() {
        if (firstNode.isPresent()) {
            return Optional.of(firstNode.get().data);
        } else {
            return Optional.empty();
        }
    }
}

