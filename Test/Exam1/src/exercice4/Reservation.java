package exercice4;

import java.util.Date;

public class Reservation {
	
	//Defini par la date, le numero de chambre
	public String chambre;
	public Date date;
	
	public Reservation(String chambre, Date date) {
		this.chambre = chambre;
		this.date = date;
	}
	
	//Modification
	public void modifier(Reservation modifie) {
		if (this.equals(modifie)) {
			chambre = modifie.chambre;
			date = modifie.date;
		}
	}
	
	//Afficher la reservation
	public String consulterReservation() {
		return "La chambre numérot" + chambre + "est réservé le " + date;
	}
	
}
