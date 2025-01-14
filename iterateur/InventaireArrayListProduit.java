package iterateur;

import java.util.ArrayList;
import java.util.Iterator;

public class InventaireArrayListProduit implements IIventaireProduit {

    private ArrayList<Produit> produits;

    public InventaireArrayListProduit() {
        produits = new ArrayList<>();

        ajouterProduit("Produit 1 - ArrayList", "Description produit 1 - ArrayList", 17.25, 245);
        ajouterProduit("Produit 2 - ArrayList", "Description produit 2 - ArrayList", 22.5, 345);
        ajouterProduit("Produit 3 - ArrayList", "Description produit 3 - ArrayList", 75.99, 45);
    }

    public void ajouterProduit(String nom, String description, double prix, int quantite){
        produits.add(new Produit(nom, description, prix, quantite));
    }

    private ArrayList<Produit> getProduits() {
        return produits;
    }

    @Override
    public Iterator<Produit> creerIterateur() {
        return produits.iterator();
    }
}
