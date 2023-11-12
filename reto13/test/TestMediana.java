package modulo3.reto13.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static modulo3.reto13.uitls.mediana.calcularMediana;
/**
 * Esta clase contiene pruebas para calcular la mediana de un array de enteros.
 */
public class TestMediana {
    /**
     * Este método de prueba verifica la corrección del cálculo de la mediana para diferentes escenarios:
     * - Un array con un número impar de elementos
     * - Un array con un número par de elementos
     * - Un array con un solo elemento
     */
    @Test
    public void testCalcularMediana() {
        double[] numerosImpares = {7, 2.7, 3, 1, 4, 5, 6};
        double medianaImpares = calcularMediana(numerosImpares);
        Assert.assertEquals(4.0, medianaImpares, 0.0);

        double[] numerosPares = {7, 2.7, 3, 1, 4, 5};
        double medianaPares = calcularMediana(numerosPares);
        Assert.assertEquals(3.5, medianaPares, 0.0);

        double[] unSoloNumero = {1};
        double medianaUnSoloNumero = calcularMediana(unSoloNumero);
        Assert.assertEquals(1.0, medianaUnSoloNumero, 0.0);
    }
    /**
     * Este método de prueba verifica que se lance una IllegalArgumentException al intentar calcular la mediana de un array vacío.
     */
    @Test
    public void testCalcularMedianaArrayVacio() {
        double[] numerosVacios = {};
        try {
            calcularMediana(numerosVacios);
            Assert.fail("Se esperaba una IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // La prueba pasa si se lanza la excepción
        }
    }
}
