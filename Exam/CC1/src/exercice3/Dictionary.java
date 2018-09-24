package exercice3;

import java.util.ArrayList;
import java.util.Hashtable;

public class Dictionary {
	private final Hashtable<String, Word> dictionary = new Hashtable<>();
	
	public void add(Word w) {
		dictionary.put(w.id, w);
	}
	
	
	public Word find(String id){
		Word myWord = dictionary.get(id);
		return myWord; 
	}
}
