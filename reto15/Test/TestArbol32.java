package modulo3.reto15.Test;

import modulo3.reto15.uitls.searchers.Arbol32;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Clase TestArbol32 que contiene pruebas unitarias para la clase Arbol32.
 */
public class TestArbol32 {
    /**
     * Prueba el método agregar y buscar de la clase Arbol32.
     */
    @Test
    public void testAgregarYBuscar() {
        Arbol32 arbol = new Arbol32();

        arbol.agregar(10);
        arbol.agregar(20);
        arbol.agregar(5);
        arbol.agregar(15);

        assertTrue(arbol.buscar(10));
        assertTrue(arbol.buscar(20));
        assertTrue(arbol.buscar(5));
        assertTrue(arbol.buscar(15));
        assertFalse(arbol.buscar(25));
    }
}
