package SearchingAlgo;

public class TernarySearch {

    public static void HasElementInArray(int arr[], int num) {
        int l, r, mid1, mid2;
        l = 0;
        r = arr.length - 1;
        boolean status = false;

        while (l <= r) {
            mid1 = l + (r - l) / 3;
            mid2 = r - (r - l) / 3;
            if (num == arr[mid1] || num == arr[mid2]) {
                status = true;
                break;
            }
            if (arr[mid1] > num) {
                r = mid1 - 1;
            } else if (arr[mid2] < num) {
                l = mid2 + 1;
            } else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        if (status) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 29, 36, 45, 75, 98, 101 };
        int num = 229;
        HasElementInArray(array, num);
    }
}
