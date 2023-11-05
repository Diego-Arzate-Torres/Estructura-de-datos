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
        if (n == 0 || n == 1) {
            return 1;
        }
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Imprime los primeros n números de la serie de Fibonacci de manera recursiva.
     *
     * @param n El número total de términos a imprimir.
     * @param i El índice del término actual a imprimir.
     */

    /**
     * Método principal para probar el método fibonacci.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {

        System.out.println(" el Fibonacci de 10 es: " + fibonacci(10));

    }
}
