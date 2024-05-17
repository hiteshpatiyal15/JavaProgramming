package SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {66, 55, 26, 25, 18, 100};
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
