package visitor;

public class Triangle implements Forme {
	private double hauteur, base;

	public Triangle(double hauteur, double base) {
		this.hauteur = hauteur;
		this.base = base;
	}

	@Override
	public void accept(Visitor visitor) {		
		visitor.visit(this);
	}
	
	public double getHauteur() {
		return hauteur;
	}

	public double getBase() {
		return base;
	}

}
