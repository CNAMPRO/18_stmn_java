package exercice3;

import java.util.ArrayList;

public class NewDictionary {
	private ArrayList<objectInterface> oI;

	public NewDictionary() { 
		oI = new ArrayList<>(); 
	}
	
	public void addObject(objectInterface oITemp) { 
		oI.add(oITemp); 
	}
	public objectInterface find(String id) {
		for (objectInterface oI:oI) { 
			if (oI.getIdentifiant().equals(id)) 
			{ 
				return oI; 
			} 
		} return null; 
	}
	
}


