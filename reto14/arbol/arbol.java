package reto14.arbol;

import reto14.utils.nodo;

/**
 * Clase que representa un árbol binario.
 */
public class arbol {
    nodo raiz;

    /**
     * Inserta un valor en el árbol.
     * @param valor El valor a insertar.
     */
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    /**
     * Método recursivo para insertar un valor en el árbol.
     * @param raiz La raíz del árbol o subárbol.
     * @param valor El valor a insertar.
     * @return La nueva raíz del árbol o subárbol.
     */
    nodo insertarRec(nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        else if (valor > raiz.valor)
            raiz.derecha = insertarRec(raiz.derecha, valor);
        return raiz;
    }

    /**
     * Busca un valor en el árbol.
     * @param valor El valor a buscar.
     * @return El valor si se encuentra, -1 en caso contrario.
     */
    public int buscar(int valor) {
        int min = minValor(raiz);
        int max = maxValor(raiz);
        return buscarRec(raiz, valor, min, max);
    }

    /**
     * Método recursivo para buscar un valor en el árbol.
     * @param raiz La raíz del árbol o subárbol.
     * @param valor El valor a buscar.
     * @param min El valor mínimo en el árbol o subárbol.
     * @param max El valor máximo en el árbol o subárbol.
     * @return El valor si se encuentra, -1 en caso contrario.
     */
    int buscarRec(nodo raiz, int valor, int min, int max) {
        if (raiz == null || min > max || valor < min || valor > max)
            return -1;

        if (raiz.valor == valor)
            return valor;

        int pos;
        if (max == min) {
            pos = min;
        } else {
            pos = min + ((valor - min) * (max - min)) / (max - min);
        }

        if (pos < raiz.valor)
            return buscarRec(raiz.izquierda, valor, min, raiz.valor);
        else
            return buscarRec(raiz.derecha, valor, raiz.valor, max);
    }

    /**
     * Encuentra el valor mínimo en el árbol.
     * @param raiz La raíz del árbol.
     * @return El valor mínimo en el árbol.
     */
    int minValor(nodo raiz) {
        int minv = raiz.valor;
        while (raiz.izquierda != null) {
            minv = raiz.izquierda.valor;
            raiz = raiz.izquierda;
        }
        return minv;
    }

    /**
     * Encuentra el valor máximo en el árbol.
     * @param raiz La raíz del árbol.
     * @return El valor máximo en el árbol.
     */
    int maxValor(nodo raiz) {
        int maxv = raiz.valor;
        while (raiz.derecha != null) {
            maxv = raiz.derecha.valor;
            raiz = raiz.derecha;
        }
        return maxv;
    }

    /**
     * Imprime los valores en el árbol en orden.
     */
    public void imprimir() {
        imprimirRec(raiz);
    }

    /**
     * Método recursivo para imprimir los valores en el árbol en orden.
     * @param raiz La raíz del árbol o subárbol.
     */
    void imprimirRec(nodo raiz) {
        if (raiz != null) {
            imprimirRec(raiz.izquierda);
            System.out.println(raiz.valor);
            imprimirRec(raiz.derecha);
        }
    }
}
