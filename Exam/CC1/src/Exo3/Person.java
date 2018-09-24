package Exo3;

public class Person implements Interface{
	
	private final String name;
	private final String biography;
	
	public Person(String name, String biography) 
	{
		this.name = name;
		this.biography = biography;
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

