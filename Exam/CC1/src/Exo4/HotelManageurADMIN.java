package Exo4;

import java.util.ArrayList;
import java.util.Date;

public class HotelManageurADMIN {

	private final ArrayList<HotelManageur> HotelManageurs;
	
	public HotelManageurADMIN() {
		HotelManageurs = new ArrayList<>();
	}
	public ArrayList<HotelManageur> CheckByDate(Date d) {
		ArrayList<HotelManageur> sortie = new ArrayList<>();
		for (HotelManageur b:HotelManageurs) {
			if (b.date.equals(d)) {
				sortie.add(b);
			}
		}
		return sortie;
	}
	
	public void CreeNewReservation(HotelManageur b) {
		int index = HotelManageurs.indexOf(b);
		if (index != -1) {
			HotelManageurs.get(index).update(b);
		}
		else {
			HotelManageurs.add(b);
		}
	}
	
	public void SupprimerReservation(HotelManageur b) {
		HotelManageurs.remove(b);
	}
	

	public ArrayList<HotelManageur> CheckByChambre(String Chambre) {
		ArrayList<HotelManageur> sortie = new ArrayList<>();
		for (HotelManageur b:HotelManageurs) {
			if (b.Chambre.equals(Chambre)) {
				sortie.add(b);
			}
		}
		return sortie;
	}

}
