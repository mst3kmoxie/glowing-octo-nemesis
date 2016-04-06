import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// To sort Natural Order in a self-defined class, you need to add:
// implements Comparable<what you want to compare your class to>
// [Which in this case is members of your own class.]

class Person60 implements Comparable<Person60> {
	private String name;

	public Person60(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	// To add your original class variables to a Set, you need
	// to define your hashCode and equals methods.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person60 other = (Person60) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// need to adjust compareTo method to let TreeSet work
	// to reverse order add - before 'name'

	// @Override
	/*
	 * public int compareTo(Person60 person) { return
	 * name.compareTo(person.name);
	 * 
	 * }
	 */

	// For a more obscure type of sort, like name-length:
	// TreeSets do not like variables that have equal name-lengths
	// but are still different objects (Joe is NOT Sue, even though
	// they both only have 3 letters.) - therefore the final ELSE
	// must offer another compare test so the second object is just
	// not simply rejected (Sue would be lost and just Joe listed)
	// Basically saying, if lengths are same, sort alphabetically.
	
	@Override
	public int compareTo(Person60 person) {
		int len1 = name.length();
		int len2 = person.name.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return name.compareTo(person.name);
		}
	}
}

public class Lect60_NaturalOrder {
	public static void main(String[] args) {

		List<Person60> list = new ArrayList<Person60>();
		SortedSet<Person60> set = new TreeSet<Person60>();

		addElements(list);
		addElements(set);

		Collections.sort(list);

		System.out.println("Printing List:");
		showElements(list);
		System.out.println();

		System.out.println("Printing Set:");
		showElements(set);

	}

	// Collection is the super interface [parent interface] to both List and Set
	private static void addElements(Collection<Person60> col) {
		col.add(new Person60("Joe"));
		col.add(new Person60 ("Billy"));
		col.add(new Person60("Sue"));
		col.add(new Person60("Miranda"));
		col.add(new Person60("Benjamin"));
		col.add(new Person60("Mark"));
		col.add(new Person60("Pippin"));
		col.add(new Person60("Moxie"));
		col.add(new Person60("Dawn"));
		col.add(new Person60("Tom"));
		col.add(new Person60("Juliet"));
		col.add(new Person60("Clare"));
		col.add(new Person60("Mike"));
	}

	private static void showElements(Collection<Person60> col) {

		for (Person60 element : col) {
			System.out.println(element);
		}
	}
}
