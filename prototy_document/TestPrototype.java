package prototy_document;

public class TestPrototype {
    public static void main(String[] args) {
        Document docWord = new Document("test.docx");
        docWord.setContenu("Bonjour tout le monde!");
        docWord.setLectureSeul(true);

        PrototypeDocument docWord2 = docWord.clone();
        System.out.println(((Document)docWord2).getNom());
        System.out.println(((Document)docWord2).getContenu());
    }
}
