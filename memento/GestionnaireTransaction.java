package memento;


public class GestionnaireTransaction {

    public boolean executer(Transaction transaction) {
        TableDeLaBD.Memento mem = TableDeLaBD.getInstance().creerMemento();

        if (transaction.executer()){
            transaction.commit();
            return true;
        }

        TableDeLaBD.getInstance().setMemento(mem);
        return false;
    }
}
