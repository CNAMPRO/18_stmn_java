package Exercice3;

public class Person implements IFindable {
	private String name;
	private String biography;
	
	
	
	public Person(String name, String biography) {
		this.name = name;
		this.biography = biography;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return getName();
	}
	@Override
	public String getDefinition() {
		// TODO Auto-generated method stub
		return getBiography();
	}
	

}
