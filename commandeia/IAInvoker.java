package commandeia;

public class IAInvoker {
    private IRequete requeteBonjour, requeteCapitale, requeteRacineCarree;

    public IAInvoker(IRequete bonjour, IRequete capitale, IRequete racineCarree) {
        this.requeteBonjour = bonjour;
        this.requeteCapitale = capitale;
        this.requeteRacineCarree = racineCarree;
    }

    public void repondreBonjour() {
        this.requeteBonjour.executer();
    }

    public void repondreCapitaleCanada() {
        this.requeteCapitale.executer();
    }

    public void repondreRacineCarree() {
        this.requeteRacineCarree.executer();
    }

}
