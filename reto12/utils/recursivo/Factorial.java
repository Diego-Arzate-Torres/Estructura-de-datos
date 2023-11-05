package modulo3.reto12.utils.recursivo;
/**
 * Esta clase contiene un método para calcular el factorial de un número.
 */
public class Factorial {
    /**
     * Calcula el factorial del número dado.
     *
     * @param n El número para calcular el factorial.
     * @return El factorial de n.
     */
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    /**
     * Método principal para probar el método factorial.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        int n = 0; // Número para calcular el factorial
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
