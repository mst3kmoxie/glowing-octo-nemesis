import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Lect51_ReadObjects {
	public static void main(String[] args) {
		
		System.out.println("Reading objects...");
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("tester51.bin"))) {
			
			Lect51_Person person = (Lect51_Person) os.readObject();
			System.out.println(person);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
