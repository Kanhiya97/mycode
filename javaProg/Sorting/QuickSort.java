public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 78, 3, 4, 2, 56, 3, 1, 9, -1, -4 };
        quick(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quick(arr, low, pivotIdx - 1);
            quick(arr, pivotIdx + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}