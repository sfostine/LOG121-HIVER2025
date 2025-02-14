package decorateurboisson;

public class BoissonAuSoya extends BoissonDecoratrice{
    private final double PRIX_SOYA = 0.5;

    public BoissonAuSoya(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return getBoisson().getDescription() + ", au soya";
    }

    @Override
    public double calculerPrix() {
        return getBoisson().calculerPrix() + PRIX_SOYA;
    }
}
