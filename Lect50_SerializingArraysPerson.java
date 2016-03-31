import java.io.Serializable;


public class Lect50_SerializingArraysPerson implements Serializable {

	private static final long serialVersionUID = 8152364757960142290L;
	
	private int id;
	private String name;
	
	public Lect50_SerializingArraysPerson(int id, String name) {
		this.id = id;
		this.name = name;
		
	}

	public String toString() {
		return "Lect50_SerializingArraysPerson [ID = " + id + ", Name = " + name + "]";
		
	}
	
	
}
