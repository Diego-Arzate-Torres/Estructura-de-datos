package edu.diego.arzate.torres.modulo2.reto8.utils;

import edu.diego.arzate.torres.modulo2.reto8.utils.Sorter;

import java.util.Arrays;
import java.util.Random;

/**
 * La clase PerformanceTesting se utiliza para probar el rendimiento de diferentes algoritmos de ordenamiento.
 */

public class PerformanceTesting {
    /**
     * Número de comparaciones realizadas por el algoritmo de ordenamiento.
     */
    public static  int COMPARACIONES = 0;
    /**
     * Número de movimientos realizados por el algoritmo de ordenamiento.
     */
    public static int MOVIMIENTOS = 0;


    /**
     * Prueba el rendimiento de un algoritmo de ordenamiento.
     *
     * @param sorter El algoritmo de ordenamiento a probar.
     */
    public static void testPerformance(Sorter sorter) {
        final int RANGO = 1_000;
        final int ITERACIONES = 500;
        final int INCREMENTOS = 100;

        double[][] performanceResults = new double[RANGO / INCREMENTOS][2];
        for (int N = 1, k = 0; N <= RANGO; N += INCREMENTOS, k++) {
            // llamar 500 veces cada algoritmo
            COMPARACIONES = 0;
            MOVIMIENTOS = 0;
            for (int i = 0; i < ITERACIONES; i++) {
                int[] array = getRandomArray(N, Short.MIN_VALUE, Integer.MAX_VALUE);
                sorter.sort(array);

            }
            performanceResults[k][0] += sorter.getCOMPARACIONES();
            performanceResults[k][1] += sorter.getMOVIMIENTOS();
            performanceResults[k][0] = performanceResults[k][0] / ((double) ITERACIONES);
            performanceResults[k][1] = performanceResults[k][1] / ((double) ITERACIONES);
        }


        System.out.println("{algoritmo}: ");
        System.out.println(performanceResults.length);
        for(double[] results: performanceResults)
            System.out.println(Arrays.toString(results).replace("[","").replace("]","").replace(",",""));
    }
    /**
     * Genera un array de números aleatorios.
     *
     * @param n El número de elementos en el array.
     * @param minVal El valor mínimo que puede tener un elemento del array.
     * @param maxVal El valor máximo que puede tener un elemento del array.
     * @return Un array de n números aleatorios entre minVal y maxVal.
     */
    public static int[] getRandomArray(int n, int minVal, int maxVal) {
        Random random = new Random();
        return random.ints(n, minVal, maxVal).toArray();
    }
}
