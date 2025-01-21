package composite;

public class Client {
    public static void main(String[] args) {
        Fichier fichier1 = new Document("fichier1.txt");
        Fichier fichier2 = new Document("fichier2.txt");
        Fichier fichier3 = new Document("fichier3.txt");
        Fichier fichier4 = new Document("fichier4.txt");
        Fichier fichier5 = new Document("fichier5.txt");

        // Création des répertoires
        Repertoire racine = new Repertoire("racine");
        Repertoire dossier1 = new Repertoire("dossier1");
        Repertoire dossier2 = new Repertoire("dossier2");
        Repertoire dossier3 = new Repertoire("dossier3");

        // Ajout des fichiers aux répertoires
        racine.ajouter(fichier1);
        dossier1.ajouter(fichier2);
        dossier1.ajouter(fichier3);
        dossier2.ajouter(fichier4);
        dossier3.ajouter(fichier5);

        // Ajout des sous-répertoires au répertoire racine
        racine.ajouter(dossier1);
        racine.ajouter(dossier2);
        dossier2.ajouter(dossier3);

        // Affichage de la structure avec une indentation initiale vide
        racine.afficher("");
    }
}
