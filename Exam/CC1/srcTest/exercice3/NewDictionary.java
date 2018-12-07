package exercice3;

import java.util.ArrayList;
import java.util.Hashtable;

public class NewDictionary {
	private final Hashtable<String, IDictionary> dictionary = new Hashtable<>();

	public void add(IDictionary w) {
		dictionary.put(w.getIdentifiant(), w);
	}
	
	
	public IDictionary find(String id){
		IDictionary myWord = dictionary.get(id);
		return myWord; 
	}
}
