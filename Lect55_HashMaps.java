import java.util.HashMap;
import java.util.Map;


public class Lect55_HashMaps {
	public static void main(String[] args) {
		
		// Maps store pairs of values, where one member of the pair is
		// called the Key, and the other member is called the Value
		// Key ---> Value !!
		
		// In this case, the Key will be an Integer, and 
		// the Value will be a Sring
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// to add pair key/values, use .put
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(13, "Thirteen");
		map.put(17, "Seventeen");
		map.put(19, "Nineteen");
		
		// reusing a key overwrites the first one.
		// map.put(6, "Hello");
		// key 6 would now print Hello instead of Six.
		
		// You can have duplicate Values, but you cannot have duplicate Keys in a map set.
		
		// to get, pass Key into .get(Key)
		String text = map.get(6);
		
		System.out.println("The first test gave me the result of: " + text);
		
		
		// For Each Loop to print entire map / lookup table
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value );
		} 
	}
}
