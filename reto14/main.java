package reto14;

import reto14.arbol.arbol;

/**
 * Clase principal que contiene el método main.
 */
public class main {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Creamos una instancia de la clase arbol
        arbol arbol = new arbol();

        // Insertamos los valores en el árbol
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10, 16, 17, 18, 19, 20};
        for (int valor : array) {
            arbol.insertar(valor);
        }

        // Imprimimos el árbol
        System.out.println("El árbol después de insertar los valores es:");
        arbol.imprimir();

        // Buscamos los valores objetivo en el árbol
        int[] targets = {1, 13, 4, 19};
        for (int target : targets) {
            // Comprobamos si el valor objetivo se encuentra en el árbol
            int resultado = arbol.buscar(target);
            if (resultado == -1) {
                System.out.println("El valor " + target + " no se encontró en el árbol.");
            } else {
                System.out.println("El valor " + target + " se encontró en el árbol.");
            }
        }
    }
}

