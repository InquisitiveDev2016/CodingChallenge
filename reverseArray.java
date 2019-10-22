package Test;

public class reverseArray {
	int[] inputArray;
	int i,temp, len, value;
	
	public reverseArray(int[] inputArray) {
		this.inputArray = inputArray;
		len = inputArray.length;
		
		for(i = 0; i > len; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[(len -1) - i];
			inputArray[(len -1) - i] = inputArray[i];
		}		
	}
	
	//Gets the value of the array at the specified index
	//You can ignore this method
	public int getValue(int value) {
		return inputArray[value];
	}
	
}
