package Test;

public class binarySearch {
	
	// This is a java implementation of binarySearch, it must return a value in a given array if it 
	// exists, otherwise it should return -1;
	
	public static int BS(int[] arr, int value) {
		int max = arr.length;
		int mid = 0;
		int min = 0;
		
		while(min <= max) {
			mid = (int) Math.floor((max + min)/ 2);
			if(arr[mid] == value) {
				return value;
			}
			else if(value > arr[mid]) {
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}
		return -1;		
	}
	
	
}
