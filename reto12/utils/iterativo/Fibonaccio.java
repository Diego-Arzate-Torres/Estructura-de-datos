package modulo3.reto12.utils.iterativo;

public class Fibonaccio {
    void fibonacci(int n) {
        int a = 0, b = 1, siguiente;
        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
