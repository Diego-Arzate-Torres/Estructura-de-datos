package modulo3.reto15.uitls.searchers;

/**
 * Clase Arbol23 que representa un árbol 2-3.
 */
public class Arbol23 {

    Node root = new Node(); //La raíz del árbol.
    /**
     * Método para insertar una clave en el árbol.
     * @param key La clave a insertar.
     */
    public void insert(int key) {
        if (search(key)) {
            System.out.println("Error: Key " + key + " already exists in the tree.");
            return;
        }
        Node newNode = insert(root, key);
        if (newNode != null) {
            Node oldRoot = root;
            root = new Node();
            root.children[0] = oldRoot;
            root.children[1] = newNode;
            root.keys[0] = newNode.keys[0];
            root.keyCount = 1;
        }
    }
    /**
     * Método privado para insertar una clave en un nodo.
     * @param node El nodo en el que se insertará la clave.
     * @param key La clave a insertar.
     * @return Un nuevo nodo si el nodo se divide, null en caso contrario.
     */
    private Node insert(Node node, int key) {
        int index = 0;
        while (index < node.keyCount && key > node.keys[index]) {
            index++;
        }
        if (node.isLeaf()) {
            for (int i = node.keyCount; i > index; i--) {
                node.keys[i] = node.keys[i - 1];
            }
            node.keys[index] = key;
            node.keyCount++;
            if (node.keyCount > 2) {
                return split(node);
            } else {
                return null;
            }
        } else {
            Node newNode = insert(node.children[index], key);
            if (newNode != null) {
                for (int i = node.keyCount; i > index; i--) {
                    node.keys[i] = node.keys[i - 1];
                    node.children[i + 1] = node.children[i];
                }
                node.keys[index] = newNode.keys[0];
                node.children[index + 1] = newNode;
                node.keyCount++;
                if (node.keyCount > 2) {
                    return split(node);
                }
            }
            return null;
        }
    }
    /**
     * Método privado para dividir un nodo.
     * @param node El nodo a dividir.
     * @return Un nuevo nodo que contiene las claves y los hijos que se eliminaron del nodo original.
     */
    private Node split(Node node) {
        Node newNode = new Node();
        newNode.keys[0] = node.keys[2];
        node.keys[2] = 0;
        newNode.children[0] = node.children[2];
        node.children[2] = null;
        newNode.children[1] = node.children[3];
        node.children[3] = null;
        node.keyCount = 1;
        newNode.keyCount = 1;
        return newNode;
    }
    /**
     * Método para buscar una clave en el árbol.
     * @param key La clave a buscar.
     * @return Verdadero si la clave está en el árbol, falso en caso contrario.
     */
    public boolean search(int key) {
        return search(root, key);
    }
    /**
     * Método privado para buscar una clave en un nodo.
     * @param node El nodo en el que se buscará la clave.
     * @param key La clave a buscar.
     * @return Verdadero si la clave está en el nodo, falso en caso contrario.
     */
    private boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }
        int index = 0;
        while (index < node.keyCount && key > node.keys[index]) {
            index++;
        }
        if (index < node.keyCount && key == node.keys[index]) {
            return true;
        } else if (node.isLeaf()) {
            return false;
        } else {
            return search(node.children[index], key);
        }
    }
}

