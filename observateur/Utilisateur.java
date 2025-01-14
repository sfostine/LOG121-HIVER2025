package observateur;

import java.util.ArrayList;

public class Utilisateur implements Observateur, Sujet {
    private String nom;
    ArrayList<Observateur> abonnes;

    public Utilisateur(String nom) {
        this.nom = nom;
        abonnes = new ArrayList<>();
    }

    @Override
    public void mettreAjour(String statut) {
        System.out.printf("Je suis %s, et j'ai reçu une notification pour un nouveau statut: %s %n", nom, statut);
    }

    @Override
    public void ajouterObservateur(Observateur o) {
        if (o == this) {
            System.out.printf("Je suis %s, je ne peux pas m'ajouter comme abonné à moi-même %n", nom);
            return;
        }
        else if(abonnes.contains(o)) {
            System.out.println("Cet observateur existe déjà");
            return;
        }
        abonnes.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        abonnes.remove(o);
    }

    @Override
    public void notifierObservateur(String statut) {
        for (Observateur o : abonnes) {
            o.mettreAjour(statut);
        }
    }

    public void publierStatut(String statut) {
        notifierObservateur(statut);
    }
}
