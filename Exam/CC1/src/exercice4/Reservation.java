package exercice4;

import java.util.Date;

public class Reservation {

	
	public String proprietaire;
	public String chambre;
	public String nom;
	public Date heure;
	
	public Reservation(String proprietaire, String chambre, String nom, Date heure) {
		this.proprietaire = proprietaire;
		this.chambre = chambre;
		this.nom = nom;
		this.heure = heure;
	}

	public void update(Reservation updt) {
		if (this.equals(updt)) {
			proprietaire = updt.proprietaire;
			nom = updt.nom;
		}
		else {
			
			return;
		}
	}
	
	@Override
	public boolean equals(Object temp) {
		if (!(temp instanceof Reservation)) {
			return super.equals(temp);
		}
		else {
			Reservation b = (Reservation) temp;
			return chambre.equals(b.chambre) && heure.equals(b.heure);
		}
	}
	
}




