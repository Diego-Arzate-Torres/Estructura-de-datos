package modulo3.reto12.utils.iterativo;
/**
 * Esta clase contiene un método para imprimir los primeros n números de la serie de Fibonacci.
 */
public class Fibonaccio {
    /**
     * Imprime los primeros n números de la serie de Fibonacci.
     *
     * @param n El número de términos de la serie de Fibonacci a imprimir.
     */
    public void fibonacci(int n) {
        int a = 0, b = 1, siguiente;
        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son: ");
        System.out.print(a + " " + b + " "); // Imprime los dos primeros números

        for (int i = 3; i <= n+1; ++i) { // Comienza desde el tercer número
            siguiente = a + b;
            System.out.print(siguiente + " ");
            a = b;
            b = siguiente;
        }
    }
    /**
     * Método principal para probar el método fibonacci.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        Fibonaccio fi = new Fibonaccio();
        int n = 10; // Número de términos a imprimir
        fi.fibonacci(n);
    }
}
