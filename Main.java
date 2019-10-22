package Test;

import java.util.Arrays;

public class Main
{
		//You are given 7 classes, all of the classes technically compile, but there are logic errors embedded within 
		//each class (except the Entry class)
		//You must find and debug each class in order for it to generate the correct outputs
		//You have 22 minutes to pass all tests
		//The Main method in this test is more of a "Tester" class where there are sample arrays, maps, etc.
		//that are generated in order to test each java class
		//You can take a look at the outputs generated to get an idea of what logic errors you are encountering
	
	     
	    public static void main(String[] args) 
	    {
	    	
	    //---------------------------------------------------------------------------------------------------------------------//	
	    	
	    	//1: This is a naive java implementation of a map, the output must give the value of the key
	    	//Correct Output: 
	    	//"C"
	    	//"D"
	    	ArrayedMap map = new ArrayedMap();
	    	map.put(1, "C");
	    	map.put(3, "D");
	    	System.out.println("Map results: \n");
	    	System.out.println(map.getKey(1));
	    	System.out.println(map.getKey(3));
	    	
	    		    	
	    	System.out.println("\n");
	    	
	   //-----------------------------------------------------------------------------------------------------------------------//
	    	//2: The output must return a reversed array:
	    	//Correct Output: [2,1]
	    	int[] a = new int[2];
	    	a[0] = 1;
	    	a[1] = 2;
	    	System.out.println("Reversed Array: \n");
	    	reverseArray reversed = new reverseArray(a);
	    	
	    	//Gets the values of the Array at the specified index
	    	System.out.println(reversed.getValue(0));
	    	System.out.println(reversed.getValue(1));
	    	
	    	
	    	
	    	System.out.println("\n");
	   //-----------------------------------------------------------------------------------------------------------------------//	
	    	
	    	//3: This is a FizzBuzz recursive method that counts up to 100
	    	//If it is divisible by both 3 and 5 it must print out "FizzBuzz"
	    	//If it is divisible by 3 it must print out "Fizz"
	    	//If it is divisible by 5 it must print out "Buzz"
	    	
	    	System.out.println("FizzBuzz: \n");
	    	fizzBuzz f = new fizzBuzz();
	    	
	    	//The .FizzBuzz() method is the one that actually does the fizzBuzz logic
	    	f.FizzBuzz();
	    	
	    	
	    	System.out.println("\n");
	    	
	   //-----------------------------------------------------------------------------------------------------------------------// 	
	    	
	    	//4: This is a recursive method that reverses any string given
	    	//Correct output must be: "olleh"
	    	System.out.println("Reverse String: \n");
	    	reverseString string = new reverseString();
	    	System.out.println(string.recursiveMethod("hello"));
	    	
	    	
	    	System.out.println("\n");
	  //-----------------------------------------------------------------------------------------------------------------------//
	    	
	    	//5: This is a method that determines whether the age put in is a teenager or not
	    	//A teenager is someone that is between 13 to 19 years old
	    	//If it is a teenager, the program must print out that it is a teenager
	    	//Otherwise it must print out that it is not a teenager
	    	
	    	//Correct Output for age of 13: "Is a teenager"
	    	System.out.println("isTeenager: \n");
	    	
	    	isTeenager person1 = new isTeenager(13);
	    	isTeenager person2 = new isTeenager(23);
	    	
	    	System.out.println("\n");
	  //-----------------------------------------------------------------------------------------------------------------------// 	
	    	
	    	//6: This is a java implementation of binarySearch, it must return a value in a given array if it 
	    	// exists, otherwise it should return -1;
	    	
	    	//For example:
	    	//binarySearch.BS(array, 85) should return -1
	    	//binarySearch.BS(array, 50) should return 50
	    

	    	System.out.println("binarySearch: \n");
	    		    	
	    	int[] array = new int[50];
	    	
	    	for(int i = 0; i < array.length; i++) {
	    		array[i] = i;
	    	}
	    	
	    	binarySearch binarySearch = new binarySearch();
	    	
	    	//The BS (Binary Search) method is the method that does the binary Search logic
	    	
	    	binarySearch.BS(array, 80);
	    
	    }
	    
	   
	    
	    
	    
}
