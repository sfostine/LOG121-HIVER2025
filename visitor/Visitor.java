package visitor;

public interface Visitor {
	public void visit(Triangle triangle);
	public void visit(Cercle cercle);
	public void visit(Rectangle rectangle);
}
