
public class Lecture46_Robot {

	private int id;
	
	public Lecture46_Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Robot #" + id + " is commencing start up procedures.");
		
		Brain brain = new Brain();
		brain.think();
	}
	
	public void kill(String exclamation) {
		System.out.println("Robot #" + id + " says '" + exclamation + "!!!'");
		
	}
	
	//non-static inner classes have access to main class variables.
	// Also? Not often called outside of main class it's in.
	// Here for ease-of-use by main class.
	private class Brain { 
		
		public void think() {
			System.out.println("Robot #" + id + " is thinking.");
			
		}
	}
	
	// static inner classes do NOT have access to main class variables.
	// Also? Often called outside of the main class it's in.
	// Here for ease of grouping.
	public static class Battery {
		
		public void charge() {
			System.out.println("Battery charging...");
			
		}
	}
}
