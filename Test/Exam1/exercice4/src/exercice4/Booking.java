package exercice4;

import java.util.Date;

public class Booking {

    public String owner;
    public String room;
    public String title;
    public Date date;

    public Booking(String owner, String room, String title, Date date) {
        this.owner = owner;
        this.room = room;
        this.title = title;
        this.date = date;
    }

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
            return;
        }
    }

    @Override
    public String toString() {
        return "Booking [owner=" + owner + ", room=" + room + ", title=" + title + ", date=" + date + "]";
    }


}