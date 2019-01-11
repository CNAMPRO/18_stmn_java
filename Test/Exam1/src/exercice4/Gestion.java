package exercice4;

import java.util.ArrayList;
import java.util.Date;

public class Gestion {
	private final ArrayList<Reservation> reservation;
	
	public Gestion() {
		reservation = new ArrayList<>();
	}
	
	public void ajouterReservation(Reservation chamb) {
		int idx = reservation.indexOf(chamb);
		if (idx != -1) {
			reservation.get(idx).modifier(chamb);
		}
		else {
			reservation.add(chamb);
		}
	}
	
	public void deleteBooking(Reservation chamb) {
		reservation.remove(chamb);
	}
	
	public ArrayList<Reservation> viewByDate(Date date) {
		ArrayList<Reservation> outcome = new ArrayList<>();
		for (Reservation chamb:reservation) {
			if (chamb.date.equals(date)) {
				outcome.add(chamb);
			}
		}
		return outcome;
	}
	
	public ArrayList<Reservation> viewByRoom(String chambre) {
		ArrayList<Reservation> outcome = new ArrayList<>();
		for (Reservation chamb:reservation) {
			if (chamb.chambre.equals(chambre)) {
				outcome.add(chamb);
			}
		}
		return outcome;
	}

}
