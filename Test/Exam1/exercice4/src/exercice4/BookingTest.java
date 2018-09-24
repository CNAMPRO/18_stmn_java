package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookingTest {

	@Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Booking)) {
            return super.equals(obj);
        }
        else {
            Booking b = (Booking) obj;
            return room.equals(b.room) && date.equals(b.date);
        }
    }

    public void update(Booking updt) {
        if (this.equals(updt)) {
            owner = updt.owner;
            title = updt.title;
        }
        else {
            // Update only if updt is deemed equal to current object
            return;
        }
    }

}
