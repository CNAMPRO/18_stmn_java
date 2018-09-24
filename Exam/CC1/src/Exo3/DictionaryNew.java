package Exo3;


import java.util.ArrayList;

public class DictionaryNew {

	private ArrayList<Interface> WordN;
	
	public DictionaryNew() {
		WordN = new ArrayList<>();
	}
	
	public void addWord(Interface w) {
		WordN.add(w);
	}
	
	public Interface find(String id) {
		for (Interface w:WordN) {
			if (w.getIdentifiant().equals(id)) {
				return w;
			}
		}
		return null;
	}

}