import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Main interface types are List, Map, and Set

public class Lect56_SortedMaps {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		// HashMap does not guarantee returning values as they were put in.
		// LinkedHashMap DOES maintain the order things were put in.
		// TreeMap puts things in their natural order (Strings = alphabetical, etc)
		
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value );
			
		}
	}
}
