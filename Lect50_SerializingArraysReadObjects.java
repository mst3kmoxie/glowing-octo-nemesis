import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lect50_SerializingArraysReadObjects {
	public static void main(String[] args) {

		System.out.println("Reading objects...");

		try (FileInputStream fi = new FileInputStream("MorePeople.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {

			Lect50_SerializingArraysPerson[] people = (Lect50_SerializingArraysPerson[]) os.readObject();

			@SuppressWarnings("unchecked")
			ArrayList<Lect50_SerializingArraysPerson> peopleList = (ArrayList<Lect50_SerializingArraysPerson>) os
					.readObject();

			for (Lect50_SerializingArraysPerson Lect50_SerializingArraysPerson : people) {
				System.out.println(Lect50_SerializingArraysPerson);
			}

			for (Lect50_SerializingArraysPerson Lect50_SerializingArraysPerson : peopleList) {
				System.out.println(Lect50_SerializingArraysPerson);
			}
			
			int num = os.readInt();
			
			for (int i = 0; i < num; i++) {
				Lect50_SerializingArraysPerson Lect50_SerializingArraysPerson = (Lect50_SerializingArraysPerson) os.readObject();
				System.out.println(Lect50_SerializingArraysPerson);
			}

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
