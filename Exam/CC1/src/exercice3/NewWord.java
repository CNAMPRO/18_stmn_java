package exercice3;

public class NewWord implements DictionaryElement {

	private Word w;
	
	public NewWord(String id, String definition) {
		w = new Word(id, definition);
	}
	
	@Override
	public String getId() {
		return w.id;
	}

	@Override
	public String getDescription() {
		return w.definition;
	}

}
