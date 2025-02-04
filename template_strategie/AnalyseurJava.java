package template_strategie;

import java.util.ArrayList;
import java.util.Iterator;

public class AnalyseurJava extends AnalyseurStatiqueFichier{
    @Override
    public Iterator<String> appliquerRegles(String contenu) {
        System.out.println("Application des règles dans l'analyseur Java");
        ArrayList<String> regles = new ArrayList<String>();
        regles.add("PascalCase pas respecté");
        return regles.iterator();
    }
}
