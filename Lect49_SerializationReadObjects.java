import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Lect49_SerializationReadObjects {
	public static void main(String[] args) {

		System.out.println("Reading objects...");
		
		try(FileInputStream fi = new FileInputStream("people.bin")) {
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Lect49_SerializationPerson person1 = (Lect49_SerializationPerson) os.readObject();
			Lect49_SerializationPerson person2 = (Lect49_SerializationPerson) os.readObject();
			
			os.close();
			
			System.out.println(person1);
			System.out.println(person2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
