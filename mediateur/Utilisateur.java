package mediateur;

public abstract class Utilisateur {
	protected String nom;
	protected ChatMediateur mediateur;
	
	public Utilisateur(ChatMediateur mediateur, String nom) {
		this.mediateur = mediateur;
		this.nom = nom;
	}
	
	public abstract void envoyerMessage(String message);
	public abstract void recevoirMessage(String message);
}
