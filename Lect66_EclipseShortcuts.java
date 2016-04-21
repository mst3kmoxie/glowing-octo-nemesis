import java.util.ArrayList;
import java.util.List;


// Tips and tricks for Eclipse IDE

public class Lect66_EclipseShortcuts {

	// type main, then click Ctrl-Space, then Enter
	public static void main(String[] args) {
	
	/* Many shortcuts can be found by
	 * right-clicking the work space and selecting
	 * "Source"
	 * 
	 * Like these:
	 */
	
	// Ctrl-Shift + f = corrects formatting
		
	// type sysout then Ctrl-Space
		System.out.println("Happy Dancing Hot Dogs!");
	
	// type syserr then Ctrl-Space - print out in red:
		System.err.println("An error happened here in 1851.");
		
	// f11 will run program in debug Mode
		
	// Ctrl-Shift + o = adds/removes/organizes imports
		List list;
		ArrayList thisIsSomeList;
		
		// If you want to rename a variable:
		// right-click on the variable you want to change,
		// select Refactor, then select Rename.
		// You can also rename classes in the same way; click on name in left-hand folder.
		
		thisIsSomeList = new ArrayList();
		
		// Ctrl-D removes entire line in editor;
		// Right-click Source has many useful shortcuts.
		
		class Person {
			private String name;
			private int id;
			
			
			public Person(String name, int id) {
				this.name = name;
				this.id = id;
			}
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public int getId() {
				return id;
			}
			
			public void setId(int id) {
				this.id = id;
			}
			
			
		}
		
	
		
		
		
	}
}
