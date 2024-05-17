package SortingAlgo;

public class MS2 {
    static int temArray [];
    static int length;
    static int ogArray [];

    public static void sortArray(int myArray []){
        ogArray = myArray;
        length = myArray.length;
        temArray = new int[length];
        divideArray(0, length-1);
    }

    public static void divideArray(int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            divideArray(low, mid);
            divideArray(mid+1, high);
            mergeArray(low, mid, high);
        }
       
    }

    public static void mergeArray(int low, int mid, int high){
        
        for(int i = low; i<=high;i++){
            temArray[i] = ogArray[i];
        }
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(temArray[i] <= temArray[j]){
                ogArray[k] = temArray[i];
                i++;
            }else{
                ogArray[k] = temArray[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            ogArray[k] = temArray[i];
            k++;
            i++;
        }
    }
    public static void main(String[] args) {
        int myArray [] = {32,12,11,45,98,99};
        System.out.println("Before sorting: ");
        for(int i : myArray){
            System.out.print(i + " ");
        }
        System.out.println();
        sortArray(myArray);
        System.out.println("After sorting: ");
        for(int i : myArray){
            System.out.print(i + " ");
        }
    }

    
}
