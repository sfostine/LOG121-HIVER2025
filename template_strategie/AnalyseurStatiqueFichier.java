package template_strategie;

import java.util.Iterator;

public abstract class AnalyseurStatiqueFichier {
    private StrategieRapport strategieRapport = new StrategieRapportBD();

    public final void analyserFichier(String fichier){
        String contenu = chargerFichier(fichier);
        Iterator<String> regles = appliquerRegles(contenu);
        String rapport = genererRapport(regles);
        strategieRapport.publierRapport(rapport);

    }

    private String genererRapport(Iterator<String> regles) {

        System.out.println("Génération de rapport");
        StringBuilder rapport = new StringBuilder();

        while (regles.hasNext()) {
            rapport.append(regles.next());
        }

        return rapport.toString();
    }

    public abstract Iterator<String > appliquerRegles(String contenu);

    private String chargerFichier(String fichier) {
        System.out.printf("le fichier %s est chargé%n", fichier);
        return "String contenu = test(fichier);";

       /* try {
            BufferedReader br = new BufferedReader(new FileReader(fichier));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }

    public void setStrategieRapport(StrategieRapport strategieRapport) {
        this.strategieRapport = strategieRapport;
    }
}
