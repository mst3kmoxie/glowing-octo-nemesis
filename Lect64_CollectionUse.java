import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Lect64_CollectionUse {
	
	/* Lists, Sets, or Maps?  Which one to use?
	 * 
	 * Consider:
	 * 1. What do you need the collection to do?
	 * 2. Are you using the fastest collection for your purposes?
	 *    (Think about insertion/deletion, retrieval and traversal)
	 */
	
	////////////////// LISTS /////////////////////////////////////
	
	// Store lists of objects
	// Duplicates are allowed
	// Objects remain in order
	// Elements are indexed via an integer [0,1,2,3....]
	// cf. shopping list
	// Checking for particular item in list is slow
	// Looking an item up by index is fast
	// Iterating through lists is relatively fast
	// Note: you can sort lists if you want
	
	// If you only add or remove items at the end of list, use ArrayList.
	List<String> list1 = new ArrayList<String>();
	
	// Removing or adding items elsewhere in the list?
	List<String> list2 = new LinkedList<String>();
	
	////////////////// SETS //////////////////////////////////////
	
	// Only store unique values
	// Great for removing duplicates
	// Not indexed, unlike lists
	// Very fast to check if a particular object exists
	// If you want to use your own objects, you must implement hashCode() and equals()
	
	// Order is unimportant and OK if it changes?
	// HashSet is not ordered.
	Set<String> set1 = new HashSet<String>();
	
	// Sorted in natural order?  Use TreeSet - must implement Comparable for custom types/classes
	// (1, 2, 3....;  a, b, c...... etc)
	Set<String> set2 = new TreeSet<String>();
	
	// Elements remain in order they were added
	Set<String> set3 = new LinkedHashSet<String>();
	
	/////////////////// MAPS /////////////////////////////////////
	
	// Key value pairs
	// Maps are like lookup tables
	// Retrieving a value by key is fast
	// Iterating over maps is slow
	// If you want to use your own objects as keys, you must implement hashCode() and equals()
	
	// Keys not in any particular order, and order liable to change
	Map<String, String> map1 = new HashMap<String, String>();
	
	// Keys sorted in natural order- must implement Comparable for custom types/classes
	Map<String, String> map2 = new TreeMap<String, String>();
	
	// Keys remain in order added
	Map<String, String> map3 = new LinkedHashMap<String, String>();
	
	// There are also SortedSet and SortedMap interfaces.
	
	
	
	
	
	

}
