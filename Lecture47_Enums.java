public class Lecture47_Enums {

	public static void main(String[] args) {

		Lecture47_Animal winner = Lecture47_Animal.CAT;
		Lecture47_Animal loser = Lecture47_Animal.DOG;

		switch (winner) {
		case CAT:
			System.out.println("Cats rule!");
			break;
		case DOG:
			System.out.println("Dogs drool.");
			break;
		case MOUSE:
			System.out.println("Eek.");
			break;
		default:
			break;
		}
		
		switch (loser) {
		case CAT:
			System.out.println("Cats rule!");
			break;
		case DOG:
			System.out.println("Dogs drool.");
			break;
		case MOUSE:
			System.out.println("Eek.");
			break;
		default:
			break;
		}
		
		System.out.println("If I type Lecture47_Animal.CAT I get:  ");
		System.out.println(Lecture47_Animal.CAT);
		System.out.println();
		System.out.println("If I type Lecture47_Animal.CAT.getClass() I get:");
		System.out.println(Lecture47_Animal.CAT.getClass());
		System.out.println();
		
		System.out.print("The Dog's name is ");
		System.out.println(Lecture47_Animal.DOG.getName() + ".");
		System.out.println();
		
		// If you overwrite the toString method in an enum, you get what you overwrote it to.
		System.out.println("If you overwrite the toString method in enum, you can get things like this: " + Lecture47_Animal.CAT);
		// To get the enum constant's name you do this:
		System.out.println("The enum name as a string: " + Lecture47_Animal.CAT.name());
		System.out.println();
		
		Lecture47_Animal animal2 = Lecture47_Animal.valueOf("CAT");
		System.out.println("valueOf CAT prints: " + animal2);
	}
}
