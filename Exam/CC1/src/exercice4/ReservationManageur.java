package exercice4;

import java.util.ArrayList;
import java.util.Date;

public class ReservationManageur {

	private final ArrayList<Reservation> reservations;
	
	public ReservationManageur() {
		reservations = new ArrayList<>();
	}
	
	public void creerReservation(Reservation b) {
		int idx = reservations.indexOf(b);
		if (idx != -1) {
			reservations.get(idx).update(b);
		}
		else {
			reservations.add(b);
		}
	}
	
	public void supprimerReservation(Reservation b) {
		reservations.remove(b);
	}
	
	public ArrayList<Reservation> consulterParDate(Date heure) {
		ArrayList<Reservation> outcome = new ArrayList<>();
		for (Reservation b:reservations) {
			if (b.heure.equals(heure)) {
				outcome.add(b);
			}
		}
		return outcome;
	}
	
	public ArrayList<Reservation> consulterParNumero(String chambre) {
		ArrayList<Reservation> outcome = new ArrayList<>();
		for (Reservation b:reservations) {
			if (b.chambre.equals(chambre)) {
				outcome.add(b);
			}
		}
		return outcome;
	}

}
