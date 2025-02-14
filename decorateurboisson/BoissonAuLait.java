package decorateurboisson;

public class BoissonAuLait extends BoissonDecoratrice{
    private final double PRIX_DU_LAIT = 0.25;

    public BoissonAuLait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return getBoisson().getDescription() + ", au lait";
    }

    @Override
    public double calculerPrix() {
        return getBoisson().calculerPrix() + PRIX_DU_LAIT;
    }
}
