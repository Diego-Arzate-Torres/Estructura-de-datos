package modulo3.reto12.utils.iterativo;
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
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    /**
     * Método principal para probar el método factorial.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        int n = 10; // Número para calcular el factorial
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
