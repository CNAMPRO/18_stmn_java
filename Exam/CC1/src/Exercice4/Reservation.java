package Exercice4;
import java.util.Date;
/**
 * 
 * @author Davvm
 *
 */
public class Reservation {
	int id;
	Date date;

	/**
	 * Cree une Réservation
	 * @param id
	 */
	public Reservation(int id) {
		this.id = id;
		this.date = new Date(); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param res
	 * @param id
	 * @param date
	 */
	public void modifierReservation(Reservation res, int id, Date date) {
		res.id = id;
		res.date = date;
	}
	
}
