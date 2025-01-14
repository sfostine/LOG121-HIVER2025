package iterateur;

import java.util.Arrays;
import java.util.Iterator;

public class InventaireTableauProduit implements IIventaireProduit {
    private static final int MAX_PRODUITS = 4;
    private Produit[] produits;

    int position = 0; //position du prochain élément dans le tableau

    public InventaireTableauProduit() {
        produits = new Produit[3];

        ajouterProduit("Produit 1 - tableau", "Description produit 1 - tableau", 10.78, 25);
        ajouterProduit("Produit 2 - tableau", "Description produit 2 - tableau", 17.8, 47);
        ajouterProduit("Produit 3 - tableau", "Description produit 3 - tableau", 24.97, 19);
    }

    public void ajouterProduit(String nom, String description, double prix, int quantite){
        if (position >= MAX_PRODUITS) {
            System.err.println("Désolé, on ne peut plus ajouter de nouveau produit, car notre inventaire est rempli");
        } else {
            produits[position++] = new Produit(nom, description, prix, quantite);
        }
    }

    private Produit[] getProduits() {
        return produits;
    }

    @Override
    public Iterator<Produit> creerIterateur() {
        return Arrays.asList(produits).iterator();
    }
}
