
public class Lecture48_Recursion {
	public static void main(String[] args) {
		
		//int value = 4;
		//System.out.println("The value inside the main method of the integer is: " + value);
		
		// Factorial 4: (E.g.) 4! = 4*3*2*1;
		
		int factor = 5;
		
		System.out.println("The factorial total of " + factor + " is " + factorial(factor) + ".");
		
		
		
	}
	
	
	private static int factorial(int value) {
		
		//System.out.println("The value inside the factorial method is: " + value);
		
		if(value == 1) {
			return 1;
		}
		
		return factorial(value - 1) * value;
	}
}
