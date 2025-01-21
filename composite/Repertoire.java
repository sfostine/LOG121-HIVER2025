package composite;

import java.util.ArrayList;

public class Repertoire extends Fichier{
    private ArrayList<Fichier> fichiers;
    public Repertoire(String nom) {
        super(nom);
        fichiers = new ArrayList<>();
    }

    public void ajouter(Fichier f) {
        fichiers.add(f);
    }

    @Override
    public void afficher(String ind) {
        System.out.println(ind + this.getNom());
        for (Fichier fichier : fichiers) {
            fichier.afficher(ind + "\t");
        }
    }
}
