package woodFactory;

import java.util.ArrayList;
import java.lang.Math;

public class Forme implements FormeInterface{
	ArrayList<FormeInterface> formes = new ArrayList<FormeInterface>();

	Forme() {
		
	}
	
	public double getArea() {
		double result = 0;
		for (FormeInterface forme : formes) {
			result += forme.getArea();
		}
		return result;
	}
	
}
