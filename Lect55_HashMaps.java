import java.util.HashMap;
import java.util.Map;


public class Lect55_HashMaps {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
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
		
		String text = map.get(6);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value );
		}
	}
}
