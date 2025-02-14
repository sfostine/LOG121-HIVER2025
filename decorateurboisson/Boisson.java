package decorateurboisson;

public abstract class Boisson {
    protected String description;

    public String getDescription() {
        return description;
    }

    public Boisson() {
        this.description = "Boisson";
    }

    public abstract double calculerPrix();
}
