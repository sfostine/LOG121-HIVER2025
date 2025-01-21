package strategiecompression;

public class Client {
    IStrategieCompression strategieCompression = new StrategieCompressionZip();

    public void setStrategieCompression(IStrategieCompression strategieCompression) {
        this.strategieCompression = strategieCompression;
    }

    public void compresserFichier(String nomFichier){
        this.strategieCompression.compresser(nomFichier);
    }
}
