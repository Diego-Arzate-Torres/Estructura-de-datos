package modulo3.reto12.utils.recursivo;

public class busquedaBinaria {
    int busquedaBinaria(int arr[], int l, int r, int x) {
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

}
