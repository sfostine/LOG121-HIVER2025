package adaptateur_proxy_messagerie;

import java.util.HashMap;
import java.util.Map;

public class WhatsAppAdaptateur implements Messagerie{
    private WhatsApp whatsApp;
    private final Map<String, String> UTILISATEURS = new HashMap<String, String>(){
        {
            put("Samuel", "+514-444-4444");
            put("John", "+438-222-2222");
            put("Ali", "+418-555-6644");
        }
    };

    public WhatsAppAdaptateur(WhatsApp whatsApp) {
        this.whatsApp = whatsApp;
    }

    @Override
    public void envoyerMessage(String nom_utilisateur_destinataire, String message) {
        if (!UTILISATEURS.containsKey(nom_utilisateur_destinataire)) {
            System.out.printf("Utilisateur %s n'existe pas !", nom_utilisateur_destinataire);
            return;
        }

        this.whatsApp.envoyerMessageWhatsApp(UTILISATEURS.get(nom_utilisateur_destinataire), message);
    }
}
