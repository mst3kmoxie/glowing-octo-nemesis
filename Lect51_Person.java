import java.io.Serializable;


public class Lect51_Person implements Serializable {
	
	private static final long serialVersionUID = -9176055209486388448L;
	
	private  transient int id;
	private String name;
	
	private static int count;
	
	public Lect51_Person() {
		System.out.println("Default constructor");
	}
	
	public Lect51_Person (int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Lect51_Person.count = count;
	}

	@Override
	public String toString() {
		return "Lect51_Person [ID = " + id + ", NAME = " + name + "]; Count is: " + count;
		
	}

	
}
