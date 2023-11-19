package reto14.utils;

/**
 * Clase que representa un nodo en un árbol binario.
 */
public class nodo {
    public int valor;
    public nodo izquierda, derecha;

    /**
     * Constructor para la clase nodo.
     * @param item El valor del nodo.
     */
    public nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}
