package Test;

public class fizzBuzz {
	int i = 0;
	
	public void FizzBuzz() {
		i++;
		if(i / 5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if(i % 3 == 0) {
			System.out.println("Fizz");
		}
		else if(i % 5 == 0 && i % 3 == 0) {
			System.out.println("FizzBuzz");
		}
		else {
			System.out.println(i);
		}
		if(i < 100) {
			FizzBuzz();
		}
	}
}
