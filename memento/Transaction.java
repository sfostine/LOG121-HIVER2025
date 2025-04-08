package memento;

import java.util.ArrayList;

public class Transaction {
    private ArrayList<Operation> operations;

    public Transaction() {
        operations = new ArrayList<>();
    }

    public void ajouterOperation(Operation op) {
        operations.add(op);
    }

    public boolean executer() {
        for (Operation op : operations) {
            if (!op.executer()) {
               return false;
            }
        }

        return true;
    }

    public void commit(){
        System.out.println("Toutes les operations ont pu réussi. On fait un commit de la transaction.");
    }
}
