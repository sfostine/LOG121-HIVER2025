package commandeia;

public class RequeteBonjour implements IRequete {
    private final SimpleIA ia;

    public RequeteBonjour(SimpleIA ia) {
        this.ia = ia;
    }

    @Override
    public void executer() {
        ia.repondreBonjour();
    }
}
