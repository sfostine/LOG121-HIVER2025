package singletonconnexionbasededonnee;

public class ConnexionBD {
    private static ConnexionBD instance;

    private ConnexionBD() {}

    public static ConnexionBD getInstance() {
        if (instance == null) {
            instance = new ConnexionBD();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connexion BD réussie");
    }
}
