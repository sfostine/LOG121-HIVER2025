package strategiecompression;

public class StrategieCompression7Z implements IStrategieCompression{
    @Override
    public void compresser(String nomFichier) {
        System.out.println("Le fichier compressé est maintenant " + nomFichier + ".7z");
    }
}
