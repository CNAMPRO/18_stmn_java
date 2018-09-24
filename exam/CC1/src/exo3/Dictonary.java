package exo3;

import java.util.ArrayList;

public class Dictonary {
	private ArrayList<Word> dictionaire;
		
	public void add(Word w) {
			if (find(w.id) == w) {
				return;	
			}
			dictionaire.add(w);
		}
	
	public Word find(String id) {
		for(Word t : dictionaire) {
			if (t.id == id) {
				return t;	
			}
			else {
				return null;
			}
		}
		return null;

	}
	}

