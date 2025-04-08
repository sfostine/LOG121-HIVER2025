package chaine_approbation;

public abstract class Approbateur {
    protected Approbateur suivant;

    public void setSuivant(Approbateur suivant) {
        this.suivant = suivant;
    }

    public abstract void traiterDemande(Demande demande);
}
