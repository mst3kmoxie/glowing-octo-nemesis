import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

// A collection class that you can loop over with a For-Each type loop
// This particular example is a class invented to store a list of URLs

public class Lect63_UrlLibrary implements Iterable<String> {
	
	private LinkedList<String> urls = new LinkedList<String>();
	
	// Start of inner class!
	private class UrlIterator implements Iterator<String> {

		private int index = 0;
		
		// Method of 'implements Iterator<String>'
		@Override
		public boolean hasNext() {
			// if index is smaller than size of urls, returns true;
			// otherwise returns false
			return index < urls.size();
			
		}

		// Method of 'implements Iterator<String>'
		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder(); 
			
			try {
				URL url = new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				
				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
					
				}
				br.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}

		// Method of 'implements Iterator<String>'
		@Override
		public void remove() {
			urls.remove(index);
			
		}
		
	}  // End of inner class!
	
	// Constructor of Lect63_UrlLibrary class!
	public Lect63_UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com/caveofprogramming");
		urls.add("http://news.bbc.co.uk");
	}

	// Method of 'implements Iterable<String>':
	@Override
	public Iterator<String> iterator() {
		
		return new UrlIterator();
	}

	/** @Override
	public Iterator<String> iterator() {
		// Use iterator already in place with LinkedList class
		return urls.iterator();
		
	} */
	
	
}
