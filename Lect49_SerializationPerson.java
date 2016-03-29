import java.io.Serializable;


public class Lect49_SerializationPerson implements Serializable {

	private static final long serialVersionUID = -1920898254375765762L;
	
	private int id;
	private String name;
	
	public Lect49_SerializationPerson(int id, String name) {
		this.id = id;
		this.name =name;
	}

	@Override
	public String toString() {
		return "Lect49_SerializationPerson [ID = " + id + ", Name = " + name + "]";
	}
	
	
}
