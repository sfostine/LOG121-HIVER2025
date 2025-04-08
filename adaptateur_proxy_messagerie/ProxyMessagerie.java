package adaptateur_proxy_messagerie;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProxyMessagerie implements Messagerie{

    private final List<String> LISTE_UTILISATEURS_ACCES = Arrays.asList("Sarah", "Marc");
    private Messagerie messagerie;

    public ProxyMessagerie(Messagerie messagerie) {
        this.messagerie = messagerie;
    }

    @Override
    public void envoyerMessage(String nom_utilisateur_destinataire, String message) {
        System.out.printf("Quel est la personne qui veut envoyer le message à %s?\n", nom_utilisateur_destinataire);

        Scanner scanner = new Scanner(System.in);
        String destinateur = scanner.nextLine();

        if (!LISTE_UTILISATEURS_ACCES.contains(destinateur)) {
            System.out.println("Accès refusé! Vous ne pouvez pas envoyer de message");
            return;
        }

        messagerie.envoyerMessage(nom_utilisateur_destinataire, message);
    }
}
