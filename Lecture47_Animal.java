
public enum Lecture47_Animal {
	
	CAT("Fergus"), DOG("Poop"), MOUSE("Squeak");
	
	private String name;
	
	Lecture47_Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This animal is called " + this.name + ".";
	}

}
