package exercice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictonary {

	Map<String, String> list = new HashMap<>();
	public void add(Word w) {
		list.put(w.getId(), w.getDefinition());
	}
	public Word find(String id) {
			if(list.get(id) != null) {
				Word newWord = new Word(id,list.get(id));
				return newWord;	
			}else return null;
			
		
		
	}
}
