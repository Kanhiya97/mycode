public class MergeSort {
    public static void merge(int[] arr, int s, int mid, int e) {
        int mergedArr[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int idx3 = 0;
        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArr[idx3++] = arr[idx1++];
            } else {
                mergedArr[idx3++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergedArr[idx3++] = arr[idx1++];
        }
        while (idx2 <= e) {
            mergedArr[idx3++] = arr[idx2++];
        }

        for (int i = 0, j = s; i < mergedArr.length; i++, j++) {
            arr[j] = mergedArr[i];
        }
    }

    public static void divide(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = (s + e) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 7, 54, 1 };
        divide(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}