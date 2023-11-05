package modulo3.reto12.utils.recursivo;
/**
 * Esta clase contiene un método para calcular los primeros n números de la serie de Fibonacci.
 */
public class Fibonaccio {
    /**
     * Calcula el n-ésimo número de la serie de Fibonacci.
     *
     * @param n El índice del número en la serie de Fibonacci a calcular.
     * @return El n-ésimo número de la serie de Fibonacci.
     */
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /**
     * Método principal para probar el método fibonacci.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        int n = 0; // Número de términos a imprimir
        System.out.println("Los primeros " + (n) + " términos de la serie de Fibonacci son: ");

        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
