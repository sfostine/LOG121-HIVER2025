package mediateur;

public class ChatTest {

	public static void main(String[] args) {
		ChatMediateurImplementation chatMediateur = new ChatMediateurImplementation();
		
		Utilisateur Bob = new UtilisateurDeBase(chatMediateur, "Bob");
		Utilisateur Alice = new UtilisateurDeBase(chatMediateur, "Alice");
		Utilisateur Ali = new UtilisateurDeBase(chatMediateur, "Ali");
		
		chatMediateur.ajouterUtilisateur(Bob);
		chatMediateur.ajouterUtilisateur(Alice);
		chatMediateur.ajouterUtilisateur(Ali);
		
		Bob.envoyerMessage("Bonjour tout le monde!");
		Alice.envoyerMessage("Comment avez-vous trouvé le quiz?");
		
	}

}
