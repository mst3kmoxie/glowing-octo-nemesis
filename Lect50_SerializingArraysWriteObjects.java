import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Lect50_SerializingArraysWriteObjects {
	public static void main(String[] args) {

		System.out.println("Writing objects...");

		Lect50_SerializingArraysPerson[] people = {
				new Lect50_SerializingArraysPerson(1, "Sue"),
				new Lect50_SerializingArraysPerson(99, "Mike"),
				new Lect50_SerializingArraysPerson(7, "Bob"),
				new Lect50_SerializingArraysPerson(66, "Panda"),
				new Lect50_SerializingArraysPerson(74, "Benjamin") };

		ArrayList<Lect50_SerializingArraysPerson> peopleList = new ArrayList<Lect50_SerializingArraysPerson>(
				Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("MorePeople.bin")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);

			os.writeObject(peopleList);

			os.writeInt(peopleList.size());
			
			for(Lect50_SerializingArraysPerson Lect50_SerializingArraysPerson: peopleList) {
				os.writeObject(Lect50_SerializingArraysPerson);
			}

			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
