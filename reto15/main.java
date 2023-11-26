package modulo3.reto15;

import modulo3.reto15.uitls.searchers.Arbol23;

/**
 * Clase main que contiene el método principal para ejecutar el programa.
 */
public class main {
    /**
     * Método principal que crea un árbol, agrega algunos números y luego busca algunos números en el árbol.
     * Los resultados de las búsquedas se imprimen en la consola.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Arbol23 arbol = new Arbol23();

        // Insertamos algunos elementos en el árbol
        arbol.insert(5);
        arbol.insert(3);
        arbol.insert(15);
        arbol.insert(20);

        // Buscamos algunos elementos en el árbol
        System.out.println("¿El número 20 está en el árbol? " + (arbol.search(3) ? "Sí" : "No"));
        System.out.println("¿El número 5 está en el árbol? " + (arbol.search(5) ? "Sí" : "No"));
    }
}
