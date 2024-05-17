package SortingAlgo;

public class MergeSort {
	 int array [] ;
	 int tempMergeArr [];
	 int length;
	
	public static void main(String[] args) {
		int arr [] = {32, 12, 1, 2, 54, 30};
		MergeSort ms  = new MergeSort();
		ms.sort(arr);
		for(int i : arr) {
			System.out.println(i + " ");
		}
		
	}
	
	public  void sort(int arr[]) {
		this.array = arr;
		this.length = array.length;
		this.tempMergeArr = new int[length];
		divideArr(0, length-1);
	}
	public  void divideArr( int lowerindex, int higherindex) {
		
		if(lowerindex < higherindex) {
			
			int middle = lowerindex+(higherindex - lowerindex)/2;
			
			//sort the left hand side of array
			divideArr(lowerindex, middle);
			
			//sort the right hand side of array
			divideArr(middle+1, higherindex);
			
			mergeArray(lowerindex, middle, higherindex);
		}
	}
	
	public  void mergeArray(int lowerindex, int middle, int higherindex) {
		for(int i = lowerindex; i<=higherindex; i++) {
			tempMergeArr[i] = array[i];
		}
		
		int i = lowerindex;
		int j = middle+1;
		int k = lowerindex;
		
		while(i<=middle && j<=higherindex) 
		{
			if(tempMergeArr[i] < array[j]) { 
				array[k] = tempMergeArr[i];
				i++;
			}else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}

}
