package exo3;

import java.util.ArrayList;

public class Dictionary {
	ArrayList<Word> al= new ArrayList<Word>();

	public void add (Word W) {
		al.add(W);
	}

	public Word find (String id) {
		for(Word word : al) {
	        if(word.id.equals(id)) {
	            return word;
	        }
	    }  
	
	return null;
	}
}


