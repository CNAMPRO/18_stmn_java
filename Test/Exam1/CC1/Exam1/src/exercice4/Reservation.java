package exercice4;
import java.util.Date;

public class Reservation {
	
	    public String proprietaire;
	    public String Chambre;
	    public String titre;
	    public Date date;

	    public Reservation(String proprietaire, String Chambre, String titre, Date date) {
	        this.proprietaire = proprietaire;
	        this.Chambre = Chambre;
	        this.titre = titre;
	        this.date = date;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof Reservation)) {
	            return super.equals(obj);
	        }
	        else {
	            Reservation b = (Reservation) obj;
	            return Chambre.equals(b.Chambre) && date.equals(b.date);
	        }
	    }

	    public void update(Reservation update) {
	        if (this.equals(update)) {
	            proprietaire = update.proprietaire;
	            titre = update.titre;
	        }
	        else {
	            return;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Reservation [proprietaire=" + proprietaire + ", Chambre=" + Chambre + ", titre=" + titre + ", date=" + date + "]";
	    }
	}
