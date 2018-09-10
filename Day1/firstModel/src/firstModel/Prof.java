package firstModel;

public class Prof extends Personne{
	String matiere;
	public Prof(String nom,String prenom, int age, String matiere) {
		super(prenom, prenom, age);
		this.matiere = matiere;
	}
}
