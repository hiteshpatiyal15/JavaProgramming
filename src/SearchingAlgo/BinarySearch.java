package SearchingAlgo;

public class BinarySearch {

    public static void binarySearch(int[] arr, int elem) {
        int a[] = arr;
        int item = elem;
        int mid, low, high;
        low = 0;
        high = a.length - 1;
        mid = (low + high)/2;
        while (low <= high) {
            if (a[mid] == item) {
                System.out.println("Item found at index " + mid);
                break;
            } else if (a[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
    }

    public static void main(String[] args) {
        int arr [] = {2,6,8,18,19,36};
        int elem = 18;
        binarySearch(arr, elem);
    }
}
