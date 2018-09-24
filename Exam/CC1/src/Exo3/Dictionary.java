package Exo3;


import java.util.ArrayList;

public class Dictionary {

	private ArrayList<Word> Word;
	
	public Dictionary() {
		Word = new ArrayList<>();
	}
	
	public void addWord(Word w) {
		Word.add(w);
	}
	
	public Word find(String id) {
		for (Word w:Word) {
			if (w.id.equals(id)) {
				return w;
			}
		}
		return null;
	}

}