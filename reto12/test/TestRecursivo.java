package modulo3.reto12.test;
import modulo3.reto12.utils.recursivo.Factorial;
import modulo3.reto12.utils.recursivo.Fibonaccio;
import modulo3.reto12.utils.recursivo.busquedaBinaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestRecursivo {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.factorial(0));
        assertEquals(1, factorial.factorial(1));
        assertEquals(2, factorial.factorial(2));
        assertEquals(6, factorial.factorial(3));
        assertEquals(24, factorial.factorial(4));
        // Agrega más casos de prueba si lo deseas
    }

    @Test
    public void testFibonacci() {
        Fibonaccio fibonacci = new Fibonaccio();
        assertEquals(0, fibonacci.fibonacci(0));
        assertEquals(1, fibonacci.fibonacci(1));
        assertEquals(1, fibonacci.fibonacci(2));
        assertEquals(2, fibonacci.fibonacci(3));
        assertEquals(3, fibonacci.fibonacci(4));
        // Agrega más casos de prueba si lo deseas
    }

    @Test
    public void testBusquedaBinaria() {
        busquedaBinaria busquedaBinaria = new busquedaBinaria();
        int arr[] = {2, 3, 4, 10, 40};
        assertEquals(-1, busquedaBinaria.busquedaBinaria(arr, 0, arr.length - 1, 1));
        assertEquals(0, busquedaBinaria.busquedaBinaria(arr, 0, arr.length - 1, 2));
        assertEquals(1, busquedaBinaria.busquedaBinaria(arr, 0, arr.length - 1, 3));
        assertEquals(2, busquedaBinaria.busquedaBinaria(arr, 0, arr.length - 1, 4));
    }
}
