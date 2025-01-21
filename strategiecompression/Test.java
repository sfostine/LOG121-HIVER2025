package strategiecompression;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

        client.compresserFichier("dossier1");

        client.setStrategieCompression(new StrategieCompressionRAR());
        client.compresserFichier("dossier2");
    }
}
