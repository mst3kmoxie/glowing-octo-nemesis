
public class Lect63_App {
	public static void main(String[] args) {
		
		//How can you make it so you can iterate through the url list
		//contained in the UrlLibrary class using the For-Each Loop?
		
		// Start by making a new instance of the class:
		Lect63_UrlLibrary urlLibrary = new Lect63_UrlLibrary();
		
		
		
		for(String html: urlLibrary) {
			System.out.println(html.length());
			//System.out.println(html);
		}
		
	}
}
