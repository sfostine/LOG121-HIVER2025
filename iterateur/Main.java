package iterateur;

public class Main {
    public static void main(String[] args) {
        IIventaireProduit produitsTableau = new InventaireTableauProduit();
        IIventaireProduit listeProduit = new InventaireArrayListProduit();

        IIventaireProduit mapProduits = new InventaireMapProduit();

        Client client = new Client(produitsTableau, listeProduit, mapProduits );
        client.afficherProduits();
    }
}