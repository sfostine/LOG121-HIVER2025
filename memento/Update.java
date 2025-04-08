package memento;

public class Update implements Operation{

    @Override
    public boolean executer() {
        return TableDeLaBD.getInstance().update();
    }
}
