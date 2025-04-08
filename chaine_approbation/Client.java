package chaine_approbation;

public class Client {
    public static void main(String[] args) {
        Approbateur gestionnaireNiveau1 = new Gestionnaire("Niveau 1", 1000);
        Approbateur gestionnaireNiveau2 = new Gestionnaire("Niveau 2", 5000);
        Approbateur gestionnaireNiveau3 = new Gestionnaire("Niveau 3", 20000);

        gestionnaireNiveau1.setSuivant(gestionnaireNiveau2);
        gestionnaireNiveau2.setSuivant(gestionnaireNiveau3);

        Demande demande1 = new Demande("clavier", 300);
        //gestionnaireNiveau1.traiterDemande(demande1);

        Demande demande2 = new Demande("laptop", 2500);
        //gestionnaireNiveau1.traiterDemande(demande2);

        Demande demande3 = new Demande("Voiture", 45500);
        gestionnaireNiveau1.traiterDemande(demande3);

    }
}
