import java.util.ArrayList;
import java.util.List;

public class FIFO {

	
	private List<Integer> Liste = new ArrayList<Integer>();
	
	
	
	public  void enfile(List<Integer> Liste, Integer valeur) {		
		Liste.add(valeur);
	}
	
	public  Integer defile(List<Integer> Liste) {
		Integer data = Liste.get(0);
		Liste.remove(0);
		return data;
	}

	public List<Integer> getListe() {
		return Liste;
	}

	public void setListe(List<Integer> liste) {
		Liste = liste;
	}


	
}
