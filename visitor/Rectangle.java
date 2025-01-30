package visitor;

public class Rectangle implements Forme{
	
	private double longueur, largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}

}
