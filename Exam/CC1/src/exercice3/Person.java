package exercice3;

public class Person implements objectInterface{
	
	String name;
	String biography;
	
	public Person(String nameTemp, String biographyTemp)
	{
		name = nameTemp;
		biography = biographyTemp;
	}
	
	@Override
	public String getIdentifiant() {
		return name;
	}

	@Override
	public String getDescription() {
		return biography;
	}

}
