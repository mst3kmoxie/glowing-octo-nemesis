import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Lect57_Sets {
	public static void main(String[] args) {
		
		// HashSet does not retain order.
		//Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers the order you added items in.
		//Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order.
		// For Strings, natural order = alphabetical order.
		Set<String> set1 = new TreeSet<String>();

		if(set1.isEmpty()) {
			System.out.println("Set is empty at start.");
			
		}
		
		// add to sets using .add(type)
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		
		// Adding duplicate items to a set does nothing.
	
		// Will not add anything to the list.
		set1.add("mouse");
		
		// print out set by using set variable name
		// because of Set toString method
		System.out.println(set1);
		
		//////// Iteration of Sets ///////////////////
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		/////// Does set contain a given item? /////
		
		String animal = "aardvark";
		
		if(set1.contains(animal)) {
			System.out.println("The set contains " + animal + ".");
		}
		else 
			System.out.println("The set does NOT contain " + animal + ".");
		System.out.println();
		
		// set2 contains some common elements with set1, and some new 
		Set<String> set2 = new TreeSet<String>();

		// add to sets using .add(type)
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		
		////////Intersection /////////////////////
		
		Set<String> intersection = new HashSet<String>(set1);
		
		// set1 and intersection contain the same elements.
		System.out.println("Elements in Set1: " + set1);
		System.out.println("...are the same elements in Intersection: " + intersection);
		
		intersection.retainAll(set2);
		System.out.println("Elements that are in both Set1 and Set2: " + intersection);
		System.out.println();
		
		///////// Difference //////////////
		
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println("Elements in Set1 that are not in Set2 include: " + difference);
		
		Set<String> difference2 = new HashSet<String>(set2);
		
		difference.removeAll(set1);
		System.out.println("Elements in Set2 that are not in Set1 include: " + difference2);

		


		
		
		
	}
}
