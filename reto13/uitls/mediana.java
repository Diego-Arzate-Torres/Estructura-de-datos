package modulo3.reto13.uitls;

import java.util.Arrays;

public class mediana {
    /**
     * Método para calcular la mediana de un array de números enteros.
     *
     * @param numeros El array de números enteros.
     * @return La mediana de los números.
     */
    public static double calcularMediana(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }

        Arrays.sort(numeros); // Ordenamos el array

        // Si el tamaño del array es par, la mediana es la media de los dos números centrales
        if (numeros.length % 2 == 0) {
            int indiceMedio = numeros.length / 2;
            return (numeros[indiceMedio - 1] + numeros[indiceMedio]) / 2.0;
        } else {
            // Si el tamaño del array es impar, la mediana es el número central
            return numeros[numeros.length / 2];
        }
    }


}
