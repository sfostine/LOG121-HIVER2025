package commandeia;

public class RequeteRacineCarree implements IRequete {
    private final SimpleIA ia;
    private double nombre;

    public RequeteRacineCarree(SimpleIA ia, double nombre) {
        this.ia = ia;
        this.nombre = nombre;
    }

    @Override
    public void executer() {
        ia.repondreRacineCarree(this.nombre);
    }
}
