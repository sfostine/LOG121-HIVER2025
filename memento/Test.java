package memento;

public class Test {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.ajouterOperation(new Update());
        transaction.ajouterOperation(new Delete());

        System.out.println(TableDeLaBD.getInstance().getDonnee().getNas());

        GestionnaireTransaction gestionnaireTransaction = new GestionnaireTransaction();
        gestionnaireTransaction.executer(transaction);
        System.out.println(TableDeLaBD.getInstance().getDonnee().getNas());

    }
}
