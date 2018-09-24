package Exercice4;
import java.util.Date;
import java.util.Map;

/**
 * 
 * @author Davvm
 *
 */
public class ReservationManager {

	public Map<String, Reservation> reservations;
	
	public void supprimerReservation(String num) {
		reservations.remove(num);
	}
	/**
	 * Consultation par numéro de reservation
	 * @param numero
	 * @return
	 */
	public Reservation consulterReservation(int id) {
		for (Reservation res : reservations.values()) {
			if(id == res.getId())
				return res;
		
		}
		return null;

	}
	
	/**
	 * Consulation par numéro
	 * @param num
	 * @return
	 */
	public Reservation consulterReservation(String num) {
		try {
			return reservations.get(num);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Consulation par Date
	 * @param date 
	 * @return
	 */
	public Reservation consulterReservation(Date date) {
		for (Reservation res : reservations.values()) {
			if(date == res.getDate()) {
				return res;
			}
		}
		return null;
	}
	
	
	
	
}
