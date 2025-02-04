package template_strategie;

import java.util.ArrayList;
import java.util.Iterator;

public class AnalyseurPython extends AnalyseurStatiqueFichier{
    @Override
    public Iterator<String> appliquerRegles(String contenu) {
        System.out.println("Application des règles dans l'analyseur Python");
        ArrayList<String> regles = new ArrayList<String>();
        regles.add("Indentation manquante");
        return regles.iterator();
    }
}
