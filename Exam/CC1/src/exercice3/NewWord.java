package exercice3;

public class NewWord implements objectInterface{
	String id;
	String definition;
	
	public NewWord(String idTemp, String definitionTemp)
	{
		id = idTemp;
		definition = definitionTemp;
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
