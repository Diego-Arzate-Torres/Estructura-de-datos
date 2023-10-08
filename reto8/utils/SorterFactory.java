package edu.diego.arzate.torres.modulo2.reto8.utils;

import edu.diego.arzate.torres.modulo2.reto8.utils.Sorter;

import java.util.Arrays;

/**
 * La clase SorterFactory se utiliza para obtener una instancia de un algoritmo de ordenamiento específico.
 */
public class SorterFactory {
    /**
     * Devuelve una instancia de un algoritmo de ordenamiento específico.
     *
     * @param method El método de ordenamiento que se desea utilizar.
     * @return Una instancia de la clase Sorter que implementa el método de ordenamiento especificado.
     */
    public static Sorter getSorter(Sorter.SorterMethods method){

        return switch (method){

            case MERGE -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    mergeSort(N, 0, N.length - 1);
                }

                public void mergeSort(int[] N, int left, int right) {
                    if (left < right) {
                        int mid = (left + right) / 2;

                        mergeSort(N, left, mid);
                        mergeSort(N, mid + 1, right);

                        merge(N, left, mid, right);
                    }
                }

                public void merge(int[] N, int left, int mid, int right) {
                    // Aquí es donde se realiza la fusión de las dos mitades
                    // Este código debería ser similar a tu método 'merge' existente
                    int[] n1 = Arrays.copyOfRange(N, left, mid + 1);
                    int[] n2 = Arrays.copyOfRange(N, mid + 1, right + 1);

                    int index1 = 0;
                    int index2 = 0;
                    int i = left;
                    while (index1 < n1.length && index2 < n2.length) {
                        COMPARACIONES++;
                        if (n1[index1] <= n2[index2]) {
                            N[i] = n1[index1];
                            index1++;
                        } else {
                            N[i] = n2[index2];
                            index2++;
                        }
                        MOVIMIENTOS++;
                        i++;
                    }

                    while (index1 < n1.length) {
                        N[i] = n1[index1];
                        index1++;
                        MOVIMIENTOS++;
                        i++;
                    }

                    while (index2 < n2.length) {
                        N[i] = n2[index2];
                        index2++;
                        MOVIMIENTOS++;
                        i++;
                    }
                }
            };
            case QUICK -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int left = 0;
                    int right = N.length - 1;
                    int partition; // índice de partición

                    if ((right - left) > 0) {
                        partition = getPartition(N, left, right);
                        quickSort(N, left, partition - 1);
                        quickSort(N, partition + 1, right);
                    }
                }

                void quickSort(int[] N, int left, int right) {
                    int partition; // índice de partición
                    if ((right - left) > 0) {
                        partition = getPartition(N, left, right);
                        quickSort(N, left, partition - 1);
                        quickSort(N, partition + 1, right);
                    }
                }

                int getPartition(int[] N, int left, int right) {
                    int pivot = right;
                    int firsthigh = left;
                    for (int counter = left; counter < right; counter++) {
                        COMPARACIONES++;  // Incrementa COMPARACIONES cada vez que se compara un par de elementos
                        if (N[counter] < N[pivot]) {
                            swap(N, counter, firsthigh);
                            firsthigh++;
                            MOVIMIENTOS++;  // Incrementa MOVIMIENTOS cada vez que se intercambian dos elementos
                        }
                    }
                    swap(N, pivot, firsthigh);
                    MOVIMIENTOS++;  // Incrementa MOVIMIENTOS cada vez que se intercambian dos elementos
                    return firsthigh;
                }
            };
            case HEAP -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;

                    for (int i = n / 2 - 1; i >= 0; i--)
                        heapify(N, n, i);

                    for (int i=n-1; i>=0; i--) {
                        swap(N, 0, i);
                        MOVIMIENTOS++;  // Incrementa MOVIMIENTOS cada vez que se intercambian dos elementos
                        heapify(N, i, 0);
                    }
                }

                void heapify(int[] N, int n, int i) {
                    int largest = i;
                    int left = 2*i + 1;
                    int right = 2*i + 2;

                    if (left < n && N[left] > N[largest]) {
                        COMPARACIONES++;  // Incrementa COMPARACIONES cada vez que se compara un par de elementos
                        largest = left;
                    }

                    if (right < n && N[right] > N[largest]) {
                        COMPARACIONES++;  // Incrementa COMPARACIONES cada vez que se compara un par de elementos
                        largest = right;
                    }

                    if (largest != i) {
                        swap(N, i, largest);
                        MOVIMIENTOS++;  // Incrementa MOVIMIENTOS cada vez que se intercambian dos elementos
                        heapify(N, n, largest);
                    }
                }
            };
            case SECUENCIAL -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;
                    for (int i = 0; i < n; i++) {
                        COMPARACIONES++;
                        if (N[i] == n) {
                            MOVIMIENTOS++;
                            return;  // Termina la búsqueda si se encuentra el valor
                        }
                    }
                }
            };
            case BINARIA -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;
                    int l = 0, r = n - 1;
                    while (l <= r) {
                        int m = l + (r - l) / 2;
                        COMPARACIONES++;
                        if (N[m] == n) {
                            MOVIMIENTOS++;
                            break;
                        }
                        if (N[m] < n)
                            l = m + 1;
                        else
                            r = m - 1;
                    }
                }
            };

              default -> throw new IllegalStateException("Unexpected value: " + method);
        };

    }
}
