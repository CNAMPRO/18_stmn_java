package exercice3;

import java.util.Hashtable;

public class Dictionary {
	private Hashtable<String, Word> words = new Hashtable<>();
	
	public void add(Word w) {
		words.put(w.id, w);
	}
	
	public Word find(String id) {
		return words.get(id);
	}
}
