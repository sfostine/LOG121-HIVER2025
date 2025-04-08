package memento;

public class Delete implements Operation{

    @Override
    public boolean executer() {
        return TableDeLaBD.getInstance().delete();
    }
}
