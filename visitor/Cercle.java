package visitor;

public class Cercle implements Forme{
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public double getRayon() {
		return rayon;
	}

}
