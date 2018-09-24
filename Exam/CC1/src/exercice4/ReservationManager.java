package exercice4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Set;

public class ReservationManager {
	private final Hashtable<Integer, Reservation> reservations = new Hashtable<Integer, Reservation>();
	
	public Reservation getReservation(Integer num) {
		return reservations.get(num);
	}
	public Reservation getReservationDate(String date) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dateFind = f.parse(date);
		Set<Integer> keys = reservations.keySet();
        for(Integer key: keys){
            Reservation uneReservation = reservations.get(key);
            if(dateFind == uneReservation.getDate())
            	return uneReservation;
        }
        return null;
	}
	
	public Reservation getOneReservation(int numero, String date) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dateFind = f.parse(date);
		Set<Integer> keys = reservations.keySet();
        for(Integer key: keys){
            Reservation uneReservation = reservations.get(key);
            if(dateFind == uneReservation.getDate() && numero == uneReservation.getNum())
            	return uneReservation;
        }
        return null;
	}
	public void closeReservation(Integer id) throws Exception {
		Reservation reservation = getReservation(id);
		if (reservation == null) throw new Exception("La Reservation n°"+id+ " n'existe pas");
		reservations.remove(id);
	}
	
	public Reservation createReservation(Integer num, String date) throws Exception {
		Reservation reservation = getOneReservation(num,date);
		if (reservation != null) throw new Exception("Reservation pour la chambre "+num+ " existe deja");
		reservation = new Reservation(num,date);
		reservations.put(num, reservation);
		return reservation;
	}
	
}
