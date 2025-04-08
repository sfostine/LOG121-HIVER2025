package chaine_approbation;

public class Gestionnaire extends Approbateur{
    private String type;
    private double seuil;

    public Gestionnaire(String type, double seuil) {
        this.type = type;
        this.seuil = seuil;
    }

    @Override
    public void traiterDemande(Demande demande) {
        if (this.seuil >= demande.getPrix()){
            System.out.printf("Étant gestionnaire de %s, je peux approuver la demande d'achat '%s', d'un montant de %.2f$ %n", this.type, demande.getNomProduit(), demande.getPrix());
        }
        else if (this.suivant != null){
            this.suivant.traiterDemande(demande);
        }
        else {
            System.out.printf("Aucun gestionnaire n'est en mesure de traiter une demande d'un montant %.2f", demande.getPrix());
        }
    }
}
