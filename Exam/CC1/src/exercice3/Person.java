package exercice3;

public class Person implements DictionaryElement {
	private final String name;
	private final String biography;
	
	public Person(String name, String biography) {
		this.name = name;
		this.biography = biography;
	}

	@Override
	public String getId() {
		return name;
	}

	@Override
	public String getDescription() {
		return biography;
	}
	
}
