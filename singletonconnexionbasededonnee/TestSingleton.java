package singletonconnexionbasededonnee;

public class TestSingleton {
    public static void main(String[] args) {
        ConnexionBD connexion1 = ConnexionBD.getInstance();
        ConnexionBD connexion2 = ConnexionBD.getInstance();

        connexion1.connect();
        connexion2.connect();
        System.out.println(connexion1 == connexion2);
    }
}
