package strategiecompression;

public class StrategieCompressionRAR implements IStrategieCompression{
    @Override
    public void compresser(String nomFichier) {
        System.out.println("Le fichier compressé est maintenant " + nomFichier + ".rar");

    }
}
