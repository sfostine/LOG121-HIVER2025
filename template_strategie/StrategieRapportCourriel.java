package template_strategie;

public class StrategieRapportCourriel implements StrategieRapport{
    @Override
    public void publierRapport(String rapport) {
        System.out.println("Le rapport a été envoyé par courriel");
    }
}
