package visitor;

public class AireVisitor implements Visitor{

	@Override
	public void visit(Triangle triangle) {
		
		double aire = 0.5 * triangle.getHauteur() * triangle.getBase();
		System.out.println("L'aire du traingle est: " + aire);
	}

	@Override
	public void visit(Cercle cercle) {
		double aire = Math.PI * cercle.getRayon() * cercle.getRayon();
		System.out.println("L'aire du cercle est: " + aire);
	}

	@Override
	public void visit(Rectangle rectangle) {
		double aire = rectangle.getLargeur() * rectangle.getLongueur();
		System.out.println("L'aire du rectangle est: " + aire);
	}

}
