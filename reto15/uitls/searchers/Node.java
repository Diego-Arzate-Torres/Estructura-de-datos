package modulo3.reto15.uitls.searchers;

/**
 * Clase Node que representa un nodo en un árbol 2-3.
 */
public class Node {

    int[] keys = new int[3]; //Un arreglo de enteros para almacenar las claves en el nodo.
    Node[] children = new Node[4]; //Un arreglo de nodos para almacenar los hijos del nodo.
    int keyCount; //Un entero para llevar la cuenta de cuántas claves hay en el nodo.

    /**
     * Método para determinar si el nodo es una hoja.
     * @return Verdadero si el nodo es una hoja, falso en caso contrario.
     */
    boolean isLeaf() {
        return children[0] == null;
    }
}
