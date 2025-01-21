package compositesystemfichier;

import java.util.ArrayList;

public class Repertoire extends Fichier{
    private ArrayList<Fichier> fichiers;
    public Repertoire(String nom) {
        super(nom);
        fichiers = new ArrayList<>();
    }

    public void ajouterFichier(Fichier fichier){
        fichiers.add(fichier);
    }

    @Override
    void afficher(String indentation) {
        System.out.println(indentation + getNom());
        for (Fichier fichier : fichiers) {
            fichier.afficher(indentation + "\t");
        }
    }
}
