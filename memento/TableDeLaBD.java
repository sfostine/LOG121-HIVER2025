package memento;

public class TableDeLaBD {
    private static TableDeLaBD instance;
    private Donnee donnee = new Donnee("Tremblay", "Samir", "435624323");

    private TableDeLaBD() {
    }

    public static TableDeLaBD getInstance() {
        if (instance == null) {
            instance = new TableDeLaBD();
        }
        return instance;
    }

    public boolean update(){
        donnee = new Donnee("Fostiné", "Samuel", "1234567");
        System.out.println("Les données ont été mises à jour");
        return true;
    }

    public boolean insert(){
        System.out.println("Les données ont été insérées dans la BD");
        return true;
    }

    public boolean delete(){
        return false;
    }

    public Memento creerMemento(){
        return new Memento(donnee);
    }

    public void setMemento(Memento m){
        this.donnee = m.getDonnee();
    }

    public Donnee getDonnee(){
        return donnee;
    }

    public class Memento{
        private Donnee donnee;
        public Memento(Donnee donnee) {
            this.donnee = donnee;
        }

        private Donnee getDonnee() {
            return donnee;
        }
    }

}
