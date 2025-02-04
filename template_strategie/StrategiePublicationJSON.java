package template_strategie;

public class StrategiePublicationJSON implements StrategieRapport{
    @Override
    public void publierRapport(String rapport) {
        System.out.println("Le rapport est généré en JSON");
    }
}
