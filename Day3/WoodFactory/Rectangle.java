public class Rectangle implements ShapeInterface {
	private double longueur;
	private double largeur;
	
	/**
	 * 
	 * @param name
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle (String name, double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	@Override
	public double getArea() {
		return largeur*longueur;
	}
	
	

}
