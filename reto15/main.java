package modulo3.reto15;

import modulo3.reto15.uitls.searchers.Arbol32;

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
        Arbol32 arbol = new Arbol32();

        arbol.agregar(10);
        arbol.agregar(20);
        arbol.agregar(5);
        arbol.agregar(15);

        System.out.println("¿El número 10 está en el árbol? " + (arbol.buscar(10) ? "Sí" : "No"));
        System.out.println("¿El número 25 está en el árbol? " + (arbol.buscar(25) ? "Sí" : "No"));
    }
}
