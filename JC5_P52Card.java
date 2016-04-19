
public class JC5_P52Card {
	private String cardFace;
	
	public JC5_P52Card(String notation) {
		cardFace = notation.toUpperCase();
		
	}
	
	public String getDescription() {

		// Split cardFace notation into value & suits
		String suit = cardFace.substring(cardFace.length()-1);
		String value = cardFace.substring(0, cardFace.length()-1);
					
		System.out.println("Card Value is: " + value);
		System.out.println("Card Suit is: " + suit);
		
		switch(value) {
		case "A":
			value =  "Ace";
			break;
		case "K":
			value = "King";
			break;
		case "Q":
			value = "Queen";
			break;
		case "J":
			value = "Jack";
			break;
		case "2":
			value = "Two";
			break;
		case "3":
			value = "Three";
			break;
		case "4":
			value = "Four";
			break;
		case "5":
			value = "Five";
			break;
		case "6":
			value = "Six";
			break;
		case "7":
			value = "Seven";
			break;
		case "8":
			value = "Eight";
			break;
		case "9":
			value = "Nine";
			break;
		case "10":
			value = "Ten";
			break;
			
		default:
			value = "Unknown Value";
		}
		
		switch(suit) {
		case "D":
			suit = "Diamonds";
			break;
		case "H":
			suit = "Hearts";
			break;
		case "S":
			suit = "Spades";
			break;
		case "C":
			suit = "Clubs";
			break;
		default:
			suit = "Unknown Suit";
		}
		
		return "The " + value + " of " + suit; 
	}	
	
}
	

