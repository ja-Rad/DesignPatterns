package patterns.behavioral.memento.implementation;

// Originator
public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String s) {
        content.append(s);
    }

    // creates the memento
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    // restore into its earlier state
    public void undoToLastSave(Object object) {
        Memento memento = (Memento) object;

        this.fileName = memento.filename;
        this.content = memento.content;
    }

    // Here we use Memento as inner class, but it could be a separate class
    private class Memento {
        private String filename;
        private StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;

            // deep copy - so that Memento and FileWriterUtil don`t refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
