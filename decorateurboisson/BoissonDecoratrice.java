package decorateurboisson;

public abstract class BoissonDecoratrice extends Boisson{

    public Boisson getBoisson() {
        return boisson;
    }

    private Boisson boisson;

    public BoissonDecoratrice(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
