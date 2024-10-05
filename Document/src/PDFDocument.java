public class PDFDocument implements Document {
    @Override
    public void create(String name) {
        System.out.println("PDF Document '" + name + "' created.");
    }
}