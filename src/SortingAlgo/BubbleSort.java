package SortingAlgo;

class BubbleSort{
    public static void main(String[] args) {
        int [] arr = {32,43,1,19,39,4};
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
       
    }
}