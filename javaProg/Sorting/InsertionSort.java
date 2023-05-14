public class InsertionSort {
    public static void bubble(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0 && val < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 1, 5, 45, 6, 2 };
        bubble(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
