package visitor;

public class TestVisitor {

	public static void main(String[] args) {
		Forme triangle = new Triangle(5.4, 6.7);
		Visitor aireVisitor = new AireVisitor();
		triangle.accept(aireVisitor);
		
		//Calcul aire rectangle
		Forme rectangle = new Rectangle(5.7, 6.8);
		rectangle.accept(aireVisitor);

	}

}
