package exercice4;

import java.util.ArrayList;
import java.util.Date;

public class GestionReservation {

	    private final ArrayList<Reservation> Reservations;

	    public GestionReservation() {
	        Reservations = new ArrayList<>();
	    }

	    public void ajoutReservation(Reservation b) {
	        int index = Reservations.indexOf(b);
	        if (index != -1) {
	            Reservations.get(index).update(b);
	        }
	        else {
	            Reservations.add(b);
	        }
	    }

	    public void supprReservation(Reservation b) {
	        Reservations.remove(b);
	    }

	    public ArrayList<Reservation> viewByDate(Date d) {
	        ArrayList<Reservation> outcome = new ArrayList<>();
	        for (Reservation b:Reservations) {
	            if (b.date.equals(d)) {
	                outcome.add(b);
	            }
	        }
	        return outcome;
	    }

	    public ArrayList<Reservation> viewByChambre(String Chambre) {
	        ArrayList<Reservation> outcome = new ArrayList<>();
	        for (Reservation b:Reservations) {
	            if (b.Chambre.equals(Chambre)) {
	                outcome.add(b);
	            }
	        }
	        return outcome;
	    }

	}
