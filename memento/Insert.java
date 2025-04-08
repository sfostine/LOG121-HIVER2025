package memento;

public class Insert implements Operation{

    @Override
    public boolean executer() {
        return TableDeLaBD.getInstance().insert();
    }
}
