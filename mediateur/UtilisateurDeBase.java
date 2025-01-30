package mediateur;

public class UtilisateurDeBase extends Utilisateur {
	
	public UtilisateurDeBase(ChatMediateur mediateur, String nom) {
		super(mediateur, nom);
	}
	
	@Override
	public void envoyerMessage(String message) {
		System.out.printf("Expéditeur: %s; message envoyé: %s \n", this.nom, message);
		this.mediateur.envoyerMessage(this, message);	
	}

	@Override
	public void recevoirMessage(String message) {
		System.out.printf("Destinataire: %s; message reçu: %s \n", this.nom, message);

	}

}
