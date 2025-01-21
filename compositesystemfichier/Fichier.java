package compositesystemfichier;

public abstract class Fichier {
    private String nom;

    public Fichier(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    abstract void afficher(String indentation);
}
