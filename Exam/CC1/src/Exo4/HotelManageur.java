package Exo4;

import java.util.Date;

public class HotelManageur {

	public String Touriste;
	public String Chambre;
	public String title;
	public Date date;
	
	public HotelManageur(String Touriste, String Chambre, String title, Date date) {
		this.Touriste = Touriste;
		this.Chambre = Chambre;
		this.title = title;
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HotelManageur)) {
			return super.equals(obj);
		}
		else {
			HotelManageur b = (HotelManageur) obj;
			return Chambre.equals(b.Chambre) && date.equals(b.date);
		}
	}
	
	public void update(HotelManageur update) {
		if (this.equals(update)) {
			Touriste = update.Touriste;
			title = update.title;
		}
		else {
			// Update only if update is deemed equal to current object
			return;
		}
	}	
}