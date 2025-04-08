package chaine_approbation;

public class Demande {
    private String nomProduit;
    private double prix;

    public Demande(String nomProduit, double prix) {
        this.nomProduit = nomProduit;
        this.prix = prix;
    }
    public String getNomProduit() {
        return nomProduit;
    }

    public double getPrix() {
        return prix;
    }
}
