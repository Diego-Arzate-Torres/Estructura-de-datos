package edu.diego.arzate.torres.Modulo1.tarea2.boletos;

import edu.diego.arzate.torres.Modulo1.tarea2.utils.Lista;
import edu.diego.arzate.torres.Modulo1.tarea2.utils.Node;


import java.util.Optional;

/**
 * La clase listaEnlazadaBoletos implementa una lista enlazada genérica.
 *
 * @param <E> El tipo de elementos almacenados en la lista.
 */
public class listaEnlazadaBoletos<E> implements Lista<E> {
    Optional<Node<E>> firstNode;

    /**
     * Constructor de la clase listaEnlazadaBoletos.
     */
    public listaEnlazadaBoletos() {
        this.firstNode = Optional.empty();
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param e El elemento a agregar.
     * @return Siempre devuelve false.
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
        return false;
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
}
