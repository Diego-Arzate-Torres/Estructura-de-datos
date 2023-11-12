package modulo3.reto13;

import static modulo3.reto13.uitls.mediana.calcularMediana;

public class main {
    /**
     * Este es el método principal que utiliza el método calcularMediana.
     *
     * @param args Sin usar.
     */
    public static void main(String[] args) {
        double[] numeros = {7, 2, 3, 1, 4, 5.2, 6};
        double mediana = calcularMediana(numeros);
        System.out.println("La mediana es: " + mediana);
    }
}
