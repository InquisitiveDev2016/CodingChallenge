package Test;

public class reverseString {
	String string;
	
	static String recursiveMethod(String str)
	{
	     if ((null != str) || (str.length() < 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
