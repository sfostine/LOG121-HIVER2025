package composite;

public abstract class Fichier {
    public Fichier(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract void afficher(String ind);

    private String nom;
}
