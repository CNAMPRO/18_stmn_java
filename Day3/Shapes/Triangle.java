public class Triangle implements ShapeInterface{

	
	private double hauteur;
	private double longueur;
	
	/**
	 * 
	 * @param name
	 * @param hauteur
	 * @param longueur
	 */
	public Triangle(String name, double hauteur, double longueur) {
		this.hauteur = hauteur;
		this.longueur = longueur;
	}


	public double getHauteur() {
		return hauteur;
	}


	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}


	public double getLongueur() {
		return longueur;
	}


	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}


	@Override
	public double getArea() {
		return hauteur*longueur/2;
	}

}
