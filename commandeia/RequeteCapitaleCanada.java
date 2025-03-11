package commandeia;

public class RequeteCapitaleCanada implements IRequete {
    private final SimpleIA ia;

    public RequeteCapitaleCanada(SimpleIA ia) {
        this.ia = ia;
    }

    @Override
    public void executer() {
        ia.repondreCapitaleCanada();
    }
}
