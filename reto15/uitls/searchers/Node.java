package modulo3.reto15.uitls.searchers;

/**
 * Clase Node que representa un nodo en un árbol binario de búsqueda.
 */
public class Node {
    /**
     * El valor almacenado en este nodo.
     */
    int dato;

    /**
     * El hijo izquierdo de este nodo.
     */
    Node izq;

    /**
     * El hijo derecho de este nodo.
     */
    Node der;

    /**
     * Constructor que crea un nuevo nodo con un valor dado.
     * @param dato El valor para este nodo.
     */
    public Node(int dato) {
        this.dato = dato;
        izq = der = null;
    }
}
