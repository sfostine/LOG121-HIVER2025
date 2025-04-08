package prototy_document;

public class Document implements PrototypeDocument {
    private String nomDocument, contenu;
    private int taille;
    private boolean lectureSeul;

    public Document(String nomDocument) {
        this.nomDocument = nomDocument;
    }

    public void setContenu(String contenu) {
        if (lectureSeul) {
            return;
        }
        this.contenu = contenu;
        taille = contenu.length();
    }

    public String getContenu() {
        return this.contenu;
    }

    public String getNom() {
        return this.nomDocument;
    }

    public void setLectureSeul(boolean lectureSeul) {
        this.lectureSeul = lectureSeul;
    }

    @Override
    public PrototypeDocument clone() {
        Document copie =  new Document("copie_" + this.nomDocument);
        copie.setContenu(this.contenu);
        copie.setLectureSeul(this.lectureSeul);
        return copie;
    }
}
