package exercice3;

public class NewWord implements IDictionary{
	public String id;
	public String definition;
	
	public NewWord(String id, String definition) {
		this.id = id;
		this.definition = definition;
	}

	@Override
	public String getIdentifiant() {
		return id;
	}

	@Override
	public String getDescription() {
		return definition;
	}
	
}