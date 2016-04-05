import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person2 {
	
	private int id;
	private String name;
	
	public Person2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "(ID is: " + id + "; Name is : " + name + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Person2 other = (Person2) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}


public class Lect58_CustomObjectSets {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2(0, "Bob");
		Person2 p2 = new Person2(1, "Sue");
		Person2 p3 = new Person2(2, "Mike");
		Person2 p4 = new Person2(1, "Sue");
		
		Map<Person2, Integer> map = new LinkedHashMap<Person2, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);

		for(Person2 key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<Person2> set = new LinkedHashSet<Person2>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
		
		
		
		
	}
}
