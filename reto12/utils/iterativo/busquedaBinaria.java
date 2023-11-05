package modulo3.reto12.utils.iterativo;
/**
 * Esta clase contiene un método para realizar una búsqueda binaria en un arreglo.
 */
public class busquedaBinaria {
    /**
     * Realiza una búsqueda binaria en el arreglo dado para encontrar el valor especificado.
     *
     * @param arr El arreglo en el que buscar. Debe estar ordenado de menor a mayor.
     * @param x El valor a buscar en el arreglo.
     * @return El índice del valor en el arreglo, o -1 si el valor no se encuentra en el arreglo.
     */
    public int busquedaBinaria(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
    /**
     * Método principal para probar el método de búsqueda binaria.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String args[]) {
        busquedaBinaria bbi = new busquedaBinaria();
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int resultado = bbi.busquedaBinaria(arr, x);
        if (resultado == -1)
            System.out.println("El elemento no está presente en el arreglo");
        else
            System.out.println("El elemento se encuentra en el índice " + resultado);
    }
}
