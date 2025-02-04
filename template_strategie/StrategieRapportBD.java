package template_strategie;

public class StrategieRapportBD implements StrategieRapport {
    @Override
    public void publierRapport(String rapport) {
        System.out.println("Le rapport a été enregistré dans la base de donnée");
    }
}
