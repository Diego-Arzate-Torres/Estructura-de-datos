package edu.diego.arzate.torres.modulo2.reto8.utils;

/**
 * La clase abstracta Sorter proporciona una estructura para implementar diferentes algoritmos de ordenamiento.
 */
public abstract class Sorter {
    protected int COMPARACIONES = 0;
    protected int MOVIMIENTOS = 0;
    /**
     * Obtiene el número de comparaciones realizadas por el algoritmo de ordenamiento.
     *
     * @return El número de comparaciones.
     */
    public int getCOMPARACIONES() {
        return COMPARACIONES;
    }
    /**
     * Obtiene el número de movimientos realizados por el algoritmo de ordenamiento.
     *
     * @return El número de movimientos.
     */
    public int getMOVIMIENTOS() {
        return MOVIMIENTOS;
    }
    /**
     * Ordena un array de números enteros. Este método debe ser implementado por cualquier clase que extienda Sorter.
     *
     * @param N El array a ordenar.
     */
    public abstract void sort(int[] N);
    /**
     * Intercambia dos elementos en un array.
     *
     * @param N El array en el que se realizará el intercambio.
     * @param i El índice del primer elemento a intercambiar.
     * @param j El índice del segundo elemento a intercambiar.
     */
    public static void swap(int[] N, int i, int j) {
        int aux = N[i];
        N[i] = N[j];
        N[j] = aux;
    }
    /**
     * Enumeración de los diferentes métodos de ordenamiento que pueden ser implementados por las clases que extienden Sorter.
     */
    public enum SorterMethods {
        MERGE,QUICK,HEAP,SECUENCIAL,BINARIA
    }
}
