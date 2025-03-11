package commandeia;

public class SimpleIA {
    public void repondreBonjour(){
        System.out.println("Bonjour! Comment puis-je vous aider?");
    }

    public void repondreCapitaleCanada(){
        System.out.println("Ottawa");
    }

    public void repondreRacineCarree(double nombre){
        System.out.printf("La racine carree de %.2f est %.2f", nombre, Math.sqrt(nombre));
    }
}
