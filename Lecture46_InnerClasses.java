
public class Lecture46_InnerClasses {
	public static void main(String[] args) {
		
		Lecture46_Robot robbie = new Lecture46_Robot(49);
		robbie.start();
		robbie.kill("You will be assimilated");
		
		Lecture46_Robot.Battery battery1 = new Lecture46_Robot.Battery();
		battery1.charge();
		
		
		Lecture46_Robot dalek = new Lecture46_Robot(66);
		dalek.start();
		dalek.kill("Exterminate");
		
		Lecture46_Robot.Battery battery2 = new Lecture46_Robot.Battery();
		battery2.charge();
		
	}
}
