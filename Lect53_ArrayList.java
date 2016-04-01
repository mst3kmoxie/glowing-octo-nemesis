import java.util.ArrayList;
import java.util.List;


public class Lect53_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding to ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1: ");
		
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
		
		System.out.println("Removed ArrayList numbers item: " + numbers.get(numbers.size() - 1));
		
		// Removing items (careful!)
		numbers.remove(numbers.size() - 1);
		
		System.out.println("Removed ArrayList numbers item: " + numbers.get(0));
		
		// This is VERY slow!
		numbers.remove(0);
		
				
		System.out.println("\nIteration #2: ");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		// List interface
		List<String> values = new ArrayList<String>();
		
		
		
		
		
		
		
		
	}
}
