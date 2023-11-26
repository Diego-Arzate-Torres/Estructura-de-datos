package modulo3.reto15.uitls.searchers;

/**
 * Clase Arbol32 que representa un árbol binario de búsqueda.
 */
public class Arbol32 {



    Node raiz;//Nodo raíz del árbol.

    /**
     * Constructor que inicializa el árbol vacío.
     */
    public Arbol32() {
        raiz = null;
    }

    /**
     * Método para agregar un nuevo nodo al árbol.
     * @param dato El valor del nuevo nodo.
     */
    public void agregar(int dato) {
        raiz = agregarRec(raiz, dato);
    }

    /**
     * Método recursivo para agregar un nuevo nodo al árbol.
     * @param raiz El nodo raíz del subárbol actual.
     * @param dato El valor del nuevo nodo.
     * @return El nodo raíz del subárbol actualizado.
     */
    private Node agregarRec(Node raiz, int dato) {
        if (raiz == null) {
            raiz = new Node(dato);
            return raiz;
        }

        if (dato < raiz.dato)
            raiz.izq = agregarRec(raiz.izq, dato);
        else if (dato > raiz.dato)
            raiz.der = agregarRec(raiz.der, dato);

        return raiz;
    }

    /**
     * Método para buscar un valor en el árbol.
     * @param dato El valor a buscar.
     * @return Verdadero si el valor está en el árbol, falso en caso contrario.
     */
    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    /**
     * Método recursivo para buscar un valor en el árbol.
     * @param raiz El nodo raíz del subárbol actual.
     * @param dato El valor a buscar.
     * @return Verdadero si el valor está en el subárbol, falso en caso contrario.
     */
    private boolean buscarRec(Node raiz, int dato) {
        if (raiz == null)
            return false;

        if (raiz.dato == dato)
            return true;

        return dato < raiz.dato ? buscarRec(raiz.izq, dato) : buscarRec(raiz.der, dato);
    }
}

