package commandeia;

public class TestIA {
    public static void main(String[] args) {
        SimpleIA simpleIA = new SimpleIA();
        IRequete bonjour = new RequeteBonjour(simpleIA);
        IRequete capitaleCanada = new RequeteCapitaleCanada(simpleIA);
        IRequete racineCarree = new RequeteRacineCarree(simpleIA, 9);

        IAInvoker invoker = new IAInvoker(bonjour, capitaleCanada, racineCarree);

        System.out.println("Bonjour");
        invoker.repondreBonjour();

        System.out.println();

        System.out.println("Quelle est la capitale du Canada");
        invoker.repondreCapitaleCanada();

        System.out.println("Quelle est la racine carree de 9");
        invoker.repondreRacineCarree();
    }
}
