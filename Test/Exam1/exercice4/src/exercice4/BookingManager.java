package exercice4;

import java.util.ArrayList;
import java.util.Date;

public class BookingManager {

    private final ArrayList<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }

    // Ajout de réservation
    public void addBooking(Booking b) {
        int idx = bookings.indexOf(b);
        if (idx != -1) {
            bookings.get(idx).update(b);
        }
        else {
            bookings.add(b);
        }
    }

    // Supprimer reservation
    public void deleteBooking(Booking b) {
        bookings.remove(b);
    }

    // Consultation par date
    public ArrayList<Booking> viewByDate(Date d) {
        ArrayList<Booking> outcome = new ArrayList<>();
        for (Booking b:bookings) {
            if (b.date.equals(d)) {
                outcome.add(b);
            }
        }
        return outcome;
    }

    public ArrayList<Booking> viewByRoom(String room) {
        ArrayList<Booking> outcome = new ArrayList<>();
        for (Booking b:bookings) {
            if (b.room.equals(room)) {
                outcome.add(b);
            }
        }
        return outcome;
    }

}