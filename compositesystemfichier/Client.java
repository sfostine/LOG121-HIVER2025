package compositesystemfichier;

public class Client {
    public static void main(String[] args) {
        Repertoire racine = new Repertoire("Racine");

        Fichier fichier1 = new Document("Fichier1.txt");
        Fichier fichier2 = new Document("Fichier2.txt");
        Fichier fichier3 = new Document("Fichier3.docx");
        Fichier fichier4 = new Document("Fichier4.txt");
        Fichier fichier5 = new Document("Fichier5.txt");

        racine.ajouterFichier(fichier1);

        Repertoire dossier1 = new Repertoire("dossier1");
        dossier1.ajouterFichier(fichier2);
        dossier1.ajouterFichier(fichier3);

        racine.ajouterFichier(dossier1);

        racine.afficher("");



    }
}
