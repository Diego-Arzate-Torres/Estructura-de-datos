package reto14.Test;

import org.junit.jupiter.api.Test;
import reto14.arbol.arbol;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que contiene pruebas unitarias para la clase arbol.
 */
public class TestArbol {
    /**
     * Prueba el método buscar de la clase arbol.
     */
    @Test
    public void testBuscar() {
        // Creamos una instancia de la clase arbol
        arbol arbol = new arbol();

        // Insertamos los valores en el árbol
        int[] array = {1,2,3,4,5,6,7,8,10,16,17,18,19,20};
        for (int valor : array) {
            arbol.insertar(valor);
        }

        // Buscamos los valores objetivo en el árbol
        int[] targets = {1,4,13,19};
        int[] expectedResults = {1,4,-1,19};
        for (int i = 0; i < targets.length; i++) {
            // Comprobamos que el resultado de la búsqueda es el esperado
            int resultado = arbol.buscar(targets[i]);
            assertEquals(expectedResults[i], resultado);
        }
    }
}
