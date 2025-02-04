package template_strategie;

public class Test {
    public static void main(String[] args) {
        AnalyseurStatiqueFichier analyseur = new AnalyseurJava();
        analyseur.setStrategieRapport(new StrategiePublicationJSON());
        analyseur.analyserFichier("test.java");
    }
}
