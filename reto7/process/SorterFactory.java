package edu.diego.arzate.torres.modulo2.reto7.process;

import edu.diego.arzate.torres.modulo2.reto7.utils.Sorter;

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
            case SELECTION -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    for (int i = 0; i < N.length - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < N.length; j++) {
                            if (N[minIndex] > N[j]) {
                                COMPARACIONES++;
                                minIndex = j;
                            }
                        }
                        if (minIndex != i) {
                            MOVIMIENTOS++;
                            swap(N, minIndex, i);
                        }
                    }
                }
            };
            case BUBBLE -> new Sorter() {
                @Override
                public void sort(int[] N){
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;
                    for (int i = 0; i < n-1; i++)
                        for (int j = 0; j < n-i-1; j++) {
                            COMPARACIONES++;
                            if (N[j] > N[j+1]) {
                                MOVIMIENTOS++;
                                int temp = N[j];
                                N[j] = N[j+1];
                                N[j+1] = temp;
                            }
                        }
                }
            };

            case INSERTION -> new Sorter(){
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;
                    for (int i = 1; i < n; ++i) {
                        int key = N[i];
                        int j = i - 1;

                        // Mueve los elementos de arr[0..i-1], que son mayores que la clave, a una posición adelante de su posición actual
                        while (j >= 0 && N[j] > key) {
                            COMPARACIONES++;
                            N[j + 1] = N[j];
                            MOVIMIENTOS++;
                            j = j - 1;
                        }
                        N[j + 1] = key;
                    }

                }
            };
            case SHELL -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    int n = N.length;

                    for (int i = 0; i < n-1; i++) {
                        int min_idx = i;
                        for (int j = i+1; j < n; j++) {
                            COMPARACIONES++;
                            if (N[j] < N[min_idx])
                                min_idx = j;
                        }


                        if (min_idx != i) {
                            MOVIMIENTOS++;
                            int temp = N[min_idx];
                            N[min_idx] = N[i];
                            N[i] = temp;
                        }
                    }
                }
            };
            case MERGE -> new Sorter() {
                @Override
                public void sort(int[] N) {
                    MOVIMIENTOS = 0;
                    COMPARACIONES = 0;
                    // Aquí es donde llamarías al método merge, si fuera necesario.
                    int[] n1 = new int[N.length / 2];
                    int[] n2 = new int[N.length - n1.length];
                    System.arraycopy(N, 0, n1, 0, n1.length);
                    System.arraycopy(N, n1.length, n2, 0, n2.length);

                    int[] merged = merge(n1, n2);
                    System.arraycopy(merged, 0, N, 0, merged.length);
                }

                public int[] merge(int[] n1, int[] n2) {
                    int[] N = new int[n1.length + n2.length];
                    int index1 = 0;
                    int index2 = 0;
                    for (int i = 0; i < N.length; i++) {
                        if (index1 == n1.length) {
                            N[i] = n2[index2];
                            index2++;
                            MOVIMIENTOS++;
                        } else if (index2 == n2.length) {
                            N[i] = n1[index1];
                            index1++;
                            MOVIMIENTOS++;
                        } else if (n1[index1] < n2[index2]) {
                            COMPARACIONES++;
                            N[i] = n1[index1];
                            index1++;
                            MOVIMIENTOS++;
                        } else {
                            COMPARACIONES++;
                            N[i] = n2[index2];
                            index2++;
                            MOVIMIENTOS++;
                        }
                    }
                    return N;  // Asegúrate de devolver el array N al final del método.
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

              default -> throw new IllegalStateException("Unexpected value: " + method);
        };

    }
}
