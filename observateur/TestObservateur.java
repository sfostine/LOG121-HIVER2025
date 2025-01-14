package observateur;

public class TestObservateur {
    public static void main(String[] args) {
        Utilisateur Alice = new Utilisateur("Alice");
        Utilisateur Bob = new Utilisateur("Bob");
        Utilisateur Charlie = new Utilisateur("Charlie");

        //Alice ne devrait pas pouvoir s'ajouter comme observateur à elle-même
        Alice.ajouterObservateur(Alice);

        //Ajouter Bob et Charlie comme abonnés à Alice
        Alice.ajouterObservateur(Bob);
        Alice.ajouterObservateur(Charlie);

        //Alice publie un statut que Bob et Charlie vont recevoir
        Alice.publierStatut("Bonjour");

        //Bob est aussi abonné à Charlie
        Charlie.ajouterObservateur(Bob);

        //Charlie publie un statut que Bob va recevoir
        Charlie.publierStatut("Bonjour mes fans! C'est Charlie");

    }
}
