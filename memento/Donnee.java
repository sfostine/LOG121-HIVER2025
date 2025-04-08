package memento;

public class Donnee {
    private String nom;
    private String prenom;

    public String getNas() {
        return nas;
    }

    private String nas;
    public Donnee (String nom, String prenom, String nas) {
        this.nom = nom;
        this.prenom = prenom;
        this.nas = nas;
    }
}
