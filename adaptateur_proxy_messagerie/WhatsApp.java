package adaptateur_proxy_messagerie;

public class WhatsApp {

    public void envoyerMessageWhatsApp(String numero, String texto) {
        System.out.printf("Message WhatsApp envoyé à %s: %s\n ", numero, texto);
    }
}
