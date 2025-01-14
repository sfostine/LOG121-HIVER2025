package iterateur;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InventaireMapProduit implements IIventaireProduit {

    private static int id = 0;
    // ArrayList holds SongInfo objects
    private Map<Integer, Produit> produits;

    public InventaireMapProduit() {
        this.produits = new HashMap<>();
        ajouterProduit("Produit 1 - Map", "Description produit 1 - Map", 29.99, 34);
        ajouterProduit("Produit 2 - Map", "Description produit 2 - Map", 36.95, 432);
        ajouterProduit("Produit 3 - Map", "Description produit 3 - Map", 53.99, 452);
    }

    public void ajouterProduit(String nom, String description, double prix, int quantite) {
        produits.put(id++, new Produit(nom, description, prix, quantite));
    }

    private Map<Integer, Produit> getProduits(){
        return produits;
    }

    @Override
    public Iterator<Produit> creerIterateur() {
        return produits.values().iterator();
    }
}
