package modulo3.reto12.test;

import modulo3.reto12.utils.iterativo.Factorial;
import modulo3.reto12.utils.iterativo.Fibonaccio;
import modulo3.reto12.utils.iterativo.busquedaBinaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIterativo {
    @Test
    public void testFactorialIterativo() {
        Factorial factorialIterativo = new Factorial();
        assertEquals(1, factorialIterativo.factorial(0));
        assertEquals(1, factorialIterativo.factorial(1));
        assertEquals(2, factorialIterativo.factorial(2));
        assertEquals(6, factorialIterativo.factorial(3));
        assertEquals(24, factorialIterativo.factorial(4));
    }



    @Test
    public void testBusquedaBinariaIterativa() {
        busquedaBinaria busquedaBinariaIterativa = new busquedaBinaria();
        int arr[] = {2, 3, 4, 10, 40};
        assertEquals(-1, busquedaBinariaIterativa.busquedaBinaria(arr, 1));
        assertEquals(0, busquedaBinariaIterativa.busquedaBinaria(arr, 2));
        assertEquals(1, busquedaBinariaIterativa.busquedaBinaria(arr, 3));
        assertEquals(2, busquedaBinariaIterativa.busquedaBinaria(arr, 4));
    }
}
