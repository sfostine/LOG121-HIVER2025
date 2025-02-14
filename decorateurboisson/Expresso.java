package decorateurboisson;

public class Expresso extends Boisson{

    private final double PRIX = 1.99;

    public Expresso() {
        this.description = "Expresso";
    }

    @Override
    public double calculerPrix() {
        return PRIX;
    }
}
