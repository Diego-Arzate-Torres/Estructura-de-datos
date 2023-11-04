package modulo3.reto12.utils.recursivo;

public class Fibonaccio {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
