package iterateur;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    public Produit(String nom, String description, double prix, int quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return nom + " " + description + " " + prix + " " + quantite;
    }
}
