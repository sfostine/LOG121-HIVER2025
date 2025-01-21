package composite;

public class Document extends Fichier{
    public Document(String nom) {
        super(nom);
    }

    @Override
    public void afficher(String ind) {
        System.out.println(ind + this.getNom());
    }
}
