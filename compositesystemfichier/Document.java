package compositesystemfichier;

public class Document extends Fichier{
    public Document(String nom) {
        super(nom);
    }

    @Override
    void afficher(String indentation) {
        System.out.println(indentation + getNom());
    }
}
