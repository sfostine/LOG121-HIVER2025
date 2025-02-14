package decorateurboisson;

public class CafeNoir extends Boisson{

    private final double PRIX = 1.5;

    public CafeNoir() {
        this.description = "Café noir";
    }

    @Override
    public double calculerPrix() {
        return PRIX;
    }
}
