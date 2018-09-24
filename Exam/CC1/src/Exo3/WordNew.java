package Exo3;

public class WordNew implements Interface{

	public final String id;
	public final String definition;
	
	public WordNew(String id, String definition) {
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