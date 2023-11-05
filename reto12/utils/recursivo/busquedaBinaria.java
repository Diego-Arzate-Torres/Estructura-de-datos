package modulo3.reto12.utils.recursivo;
/**
 * Esta clase contiene un método para realizar una búsqueda binaria en un arreglo.
 */
public class busquedaBinaria {
    /**
     * Realiza una búsqueda binaria en el arreglo dado para encontrar el valor especificado.
     *
     * @param arr El arreglo en el que buscar. Debe estar ordenado de menor a mayor.
     * @param l El índice inicial desde donde comenzar la búsqueda.
     * @param r El índice final hasta donde realizar la búsqueda.
     * @param x El valor a buscar en el arreglo.
     * @return El índice del valor en el arreglo, o -1 si el valor no se encuentra en el arreglo.
     */
    public int busquedaBinaria(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return busquedaBinaria(arr, l, mid - 1, x);
            return busquedaBinaria(arr, mid + 1, r, x);
        }
        return -1;
    }
    /**
     * Método principal para probar el método de búsqueda binaria.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        busquedaBinaria bb = new busquedaBinaria();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int resultado = bb.busquedaBinaria(arr, 0, n - 1, x);
        if (resultado == -1)
            System.out.println("El elemento no está presente en el arreglo");
        else
            System.out.println("El elemento se encuentra en el índice " + resultado);
    }
}
