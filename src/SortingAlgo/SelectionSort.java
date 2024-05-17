package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {75, 34, 36, 2, 1, 100};
        for(int i = 0 ; i < arr.length; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
