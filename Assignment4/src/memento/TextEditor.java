package memento;

public class TextEditor {
    private String text;

    public void type(String newText) {
        this.text = newText;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getState();
    }

    public String getText() {
        return text;
    }
}
