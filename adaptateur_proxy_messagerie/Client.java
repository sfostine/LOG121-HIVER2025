package adaptateur_proxy_messagerie;

public class Client {
    public static void main(String[] args) {
        Messagerie messagerie = new ProxyMessagerie(new WhatsAppAdaptateur(new WhatsApp()));
        messagerie.envoyerMessage("Samuel", "Bonjour Samuel!");
        //messagerie.envoyerMessage("Paul", "Bonjour Paul!");

    }
}
