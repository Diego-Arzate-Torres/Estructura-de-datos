package modulo3.reto12.utils.iterativo;

public class Exponencial {
    static int potencia(int base, int exponente) {
        int resultado = 1;
        while (exponente != 0) {
            resultado *= base;
            --exponente;
        }
        return resultado;
    }
}
