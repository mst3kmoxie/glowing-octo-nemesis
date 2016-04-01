
public class Lect52_PassingByReference {
	public static void main(String[] args) {
		
		Lect52_PassingByReference pbr = new Lect52_PassingByReference();
		
		//============ Passing by Value =============================
		
		int someNumber = 7;
		System.out.println("1. The value is " + someNumber + ".");
		
		pbr.show(someNumber);
		
		System.out.println("4. The value is " + someNumber + ".");
		
		
		
		//=========== Passing by Value ==============================
		
		System.out.println();
		
		Lect52_Person person = new Lect52_Person("Billy");
		System.out.println("Person #1 is: " + person);
		
		pbr.show(person);
		
		System.out.println("Person #4 is: " + person);
		
		
	}
	
	public void show(int value) {
		System.out.println("2. The value is " + value +".");
		
		value = 8;
		System.out.println("3. The value is " + value + ".");
	}
	
	public void show(Lect52_Person person) {
		System.out.println("Person #2 is: " + person);
		
		person.setName("Panda");
		
		person = new Lect52_Person("Pablo");
		System.out.println("Person #3 is: " + person);
		
	}
}
