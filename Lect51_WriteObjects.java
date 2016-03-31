import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Lect51_WriteObjects {
	public static void main(String[] args) {
		
		System.out.println("Writing objects...");
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("tester51.bin"))) {
			
			Lect51_Person person = new Lect51_Person(7, "Bob the Panda");
			Lect51_Person.setCount(88);
			
			os.writeObject(person);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
