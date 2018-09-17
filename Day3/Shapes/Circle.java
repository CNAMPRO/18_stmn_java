import java.lang.Math;
public class Circle implements ShapeInterface{
	
	private double rayon;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * 
	 * @param name
	 * @param rayon
	 */
	public Circle(String name, double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double getArea() {
		
		return Math.PI * rayon*rayon;
	}
	
	

}
