import java.util.Iterator;
import java.util.LinkedList;

public class Lect62_Iterators {
	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		// Original way to iterate, pre-Java 5:
		// Lists implement the Iterable Interface
		// This is the only way to remove items from a list 
		// WHILE iterating through it!!

		Iterator<String> it = animals.iterator();

		System.out.println("Here is the list using old school Iterable: ");

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();
		System.out
				.println("Here is the list using new school For-Each Loops instead of Iterable: ");
		
		// Modern iteration, Java 5 and later:
		for (String animal : animals) {
			System.out.println(animal);
			
			// Can't remove anything from the list here!
		}

	}
}
