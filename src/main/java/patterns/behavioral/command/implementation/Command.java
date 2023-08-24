package patterns.behavioral.command.implementation;

public interface Command {
    void execute();

    // we could add an undo or redo command that undo previous commands or redo previous commands
}

class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;
    // here we could have store previous stat for undo, redo

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // we could have save previous state, in case undo called
        this.fileSystemReceiver.openFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
