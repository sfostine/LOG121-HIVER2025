package observateur;

public interface Sujet {
    public void ajouterObservateur(Observateur o);
    public void supprimerObservateur(Observateur o);
    public void notifierObservateur(String statut);
}
