package modulo3.reto15.Test;

import modulo3.reto15.uitls.searchers.Arbol23;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Clase TestArbol32 que contiene pruebas unitarias para la clase Arbol32.
 */
public class TestArbol23 {
    /**
     * Prueba el método agregar y buscar de la clase Arbol23.
     */
    @Test
    public void testArbol23() {
        Arbol23 arbol = new Arbol23();

        // Insertamos algunos elementos en el árbol
        arbol.insert(5);
        arbol.insert(3);
        arbol.insert(15);
        arbol.insert(20);
        arbol.insert(1);
        arbol.insert(25);
        arbol.insert(13);
        arbol.insert(14);
        arbol.insert(24);
        arbol.insert(23);
        arbol.insert(22);

        // Verificamos que los elementos estén en el árbol
        assertTrue(arbol.search(5));
        assertTrue(arbol.search(3));
        assertTrue(arbol.search(15));
        assertTrue(arbol.search(20));
        assertTrue(arbol.search(1));
        assertTrue(arbol.search(25));
        assertTrue(arbol.search(13));
        assertTrue(arbol.search(14));
        assertTrue(arbol.search(24));
        assertTrue(arbol.search(23));
        assertTrue(arbol.search(22));

        // Verificamos que un elemento que no está en el árbol no se encuentre
        assertFalse(arbol.search(30));
    }
}
