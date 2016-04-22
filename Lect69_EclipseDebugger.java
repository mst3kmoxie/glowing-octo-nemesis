

public class Lect69_EclipseDebugger {
	
	public static void main(String[] args) {
	
		// set breakpoint - point where the code stops in its
		// execution so you can look at it line by line....
		// set breakpoint by double clicking side margin.
		
		// Run as Debug, not usual Run (changes to debug perspective)
		
		Lect69_Test test1 = new Lect69_Test();
		
		int value = test1.getInitialValue();
		
		test1.doStuff(value);
		
		System.out.println("Starting.");
		
		System.out.println("Hello.");
		
		System.out.println("Incrementing value.");
		
		value++;
		
		value = value - 8;
		
		System.out.println(value);
		
		System.out.println("Finishing.");
		
		
	}
}
