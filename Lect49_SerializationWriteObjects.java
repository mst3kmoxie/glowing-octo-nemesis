import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Lect49_SerializationWriteObjects {
	public static void main(String[] args) {
		
		System.out.println("Writing objects...");
		
		Lect49_SerializationPerson mike = new Lect49_SerializationPerson(543, "Mike");
		Lect49_SerializationPerson sue = new Lect49_SerializationPerson(123, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
