package mediateur;

import java.util.ArrayList;

public class ChatMediateurImplementation implements ChatMediateur{
	
	private ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		this.utilisateurs.add(utilisateur);
	}

	@Override
	public void envoyerMessage(Utilisateur expediteur, String message) {
		for(Utilisateur utilisateur: this.utilisateurs) {
			if(utilisateur != expediteur) {
				utilisateur.recevoirMessage(message);
			}
		}
		
		System.out.println();
	}

}
