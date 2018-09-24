package Exercice3;

public class Word implements IFindable{
	private String id;
	private String definition;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}


	public Word(String id, String definition) {
		this.id = id;
		this.definition = definition;
	}


}
