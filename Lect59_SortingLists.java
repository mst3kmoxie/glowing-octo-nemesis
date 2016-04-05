import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person3 {
	private int id;
	private String name;
	
	public Person3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name ;
	}
	
	
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
	
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
	
		return -s1.compareTo(s2);
	}
	
}



public class Lect59_SortingLists {
	public static void main(String[] args) {
		
		////////////// Sorting Strings ///////////////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("tiger");
		animals.add("cat");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");
		
		// Collections.sort(animals, new StringLengthComparator());
		
		 Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		System.out.println("Animals printed out in reverse alphabetical order:");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();
		
        //////////////Sorting Strings ///////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		// Sort integers in reverse order.
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});
		
		System.out.println("Numbers sorted in reverse numerical order:");
		for(Integer number: numbers) {
			System.out.println(number);
		}
		System.out.println();
		
		//////////////Sorting Arbitrary Objects ///////////////////////////
		
		List<Person3> people = new ArrayList<Person3>();
		
		people.add(new Person3(1, "Joe"));
		people.add(new Person3(3, "Bob"));
		people.add(new Person3(4, "Clare"));
		people.add(new Person3(2, "Sue"));
		
		System.out.println("An ArrayList of added people:");
		 for(Person3 person: people) {
			System.out.println(person);
		}
		System.out.println(); 
		
		// Sort in order of ID
		Collections.sort(people, new Comparator<Person3>() {
			public int compare(Person3 p1, Person3 p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
			
		});
		
		System.out.println("People organized by ID order:");
		for(Person3 person: people) {
			System.out.println(person);
		} 
		System.out.println();
		
		// Sort in order of Name
		Collections.sort(people, new Comparator<Person3>() {
			public int compare(Person3 p1, Person3 p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("People organized by alphabetical order:");
		for(Person3 person: people) {
			System.out.println(person);
		}
		
	}
}
