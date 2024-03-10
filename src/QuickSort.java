public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Particionamos el arreglo
            int pivotIndex = partition(arr, low, high);

            // Ordenamos las dos sub-matrices
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Tomamos el último elemento como pivote
        int i = low - 1; // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual que el pivote
            if (arr[j] <= pivot) {
                i++;

                // Intercambiamos arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiamos el pivote con el elemento más grande en la posición i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        quickSort(arr, 0, arr.length - 1);

        // Imprimimos el arreglo ordenado
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}