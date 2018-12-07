package exercice3;

public class Person implements IDictionary {
	public String name;
	public String biography;
	
	public Person(String name, String biography) {
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
