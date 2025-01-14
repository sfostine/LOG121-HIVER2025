package iterateur;

import java.util.Iterator;

public class Client {
    private IIventaireProduit tableauProduit;
    private IIventaireProduit listeProduit;
    private IIventaireProduit mapProduit;

    public Client(IIventaireProduit tableauProduit,
                  IIventaireProduit listeProduit,
                  IIventaireProduit mapProduit)
    {
        this.tableauProduit = tableauProduit;
        this.listeProduit = listeProduit;
        this.mapProduit = mapProduit;
    }

    //Affiche la liste de tous les produits indépendemment de la structure de donnée (collection ou tableau)
    public void afficherProduits(){
        Iterator<Produit> produitsTableau = tableauProduit.creerIterateur();
        Iterator<Produit> produitsArrayList = listeProduit.creerIterateur();
        Iterator<Produit> produitsMap= mapProduit.creerIterateur();

        afficherProduitsIterateur(produitsTableau);
        afficherProduitsIterateur(produitsArrayList);
        afficherProduitsIterateur(produitsMap);

    }

    private void afficherProduitsIterateur(Iterator<Produit> produits){
        while(produits.hasNext()){
            Produit produit = produits.next();
            System.out.println(produit);
        }
    }
}
