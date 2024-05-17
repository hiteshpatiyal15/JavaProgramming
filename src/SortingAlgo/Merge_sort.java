package SortingAlgo;

public class Merge_sort {

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[], int mid, int low, int high) {
        int i, j, k, n;
        i = low;
        j = mid + 1;
        k = low;
        n = arr.length;
        int arrB[] = new int[7];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                arrB[k] = arr[i];
                i++;
                k++;

            } else {
                arrB[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            arrB[k] = arr[i];
            k++;
            i++;
        }

        while (j <= high) {
            arrB[k] = arr[j];
            k++;
            j++;
        }

        for (int a = low; a <= high; a++) {
            arr[a] = arrB[a];
        }
    }

    static void mergeSort(int arr[], int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 32, 11 };
        int n = arr.length-1;
        printArray(arr, n+1);
        mergeSort(arr, 0, n);
        System.out.println("Sorted array: ");
        printArray(arr, n+1);

    }
}
