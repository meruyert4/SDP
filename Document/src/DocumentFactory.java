
public abstract class DocumentFactory {
    public abstract Document createDocument();

    // Generate document and pass the name
    public void generateDocument(String name) {
        Document doc = createDocument();
        doc.create(name);  // Pass the document name to the create method
    }
}
