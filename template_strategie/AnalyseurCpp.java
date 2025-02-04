package template_strategie;

import java.util.ArrayList;
import java.util.Iterator;

public class AnalyseurCpp extends AnalyseurStatiqueFichier{
    @Override
    public Iterator<String> appliquerRegles(String contenu) {
        System.out.println("Application des règles dans l'analyseur C++");
        ArrayList<String> regles = new ArrayList<String>();
        regles.add("Point virgule manquant");
        return regles.iterator();
    }
}
