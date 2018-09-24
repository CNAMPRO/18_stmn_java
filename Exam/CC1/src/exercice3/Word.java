package exercice3;

public class Word {
	String id;
	
	String definition;
	
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
	
	public Word(String id, String def) {
		this.id = id;
		this.definition = def;
	}
}
