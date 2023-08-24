package patterns.behavioral.memento.implementation;

// Helper class for Memento save and undo operations
public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterUtil fileWriterUtil) {
        this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.undoToLastSave(object);
    }
}
