public class SelectionSort {
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 8, 9, 1, 3 };
        sortArr(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
