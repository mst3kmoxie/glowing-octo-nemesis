import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//BASIC RULE:
//If you only want to add items or remove items at the end of your list, use ArrayList.
//If you want to add or remove items anywhere else in the list, use LinkedList.


public class Lect54_LinkedLists {
	public static void main(String[] args) {
		
		// Only need to specify which particular TYPE of List you want
		// at the constructor (right) side of statement.  
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		* ArrayLists manage arrays internally.
		* [0][1][2][3][4][5]....
		*/

		List<Integer> linkedList = new LinkedList<Integer>();
		
		/*
		 * LinkedLists consist of elements where each element
		 * has a reference to the previous/next element
		 * [0]->[1]->[2]... 
		 *  as well as...
		 * [0]<-[1]<-[2]...
		 */
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
		
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for(int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// add items to end of list
		for(int i = 0; i < 1E5; i++) {
			list.add(i);
			
		} */
		
		// add items elsewhere in list
		for(int i = 0; i < 1E5; i++) {
			list.add(list.size() - 100, i);
			
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		
	
	
		
	}
}





