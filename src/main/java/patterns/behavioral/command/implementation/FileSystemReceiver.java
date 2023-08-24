package patterns.behavioral.command.implementation;


public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("UnixFileSystemReceiver: openFile()");
    }

    @Override
    public void writeFile() {
        System.out.println("UnixFileSystemReceiver: writeFile()");
    }

    @Override
    public void closeFile() {
        System.out.println("UnixFileSystemReceiver: closeFile()");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("WindowsFileSystemReceiver: openFile()");
    }

    @Override
    public void writeFile() {
        System.out.println("WindowsFileSystemReceiver: writeFile()");
    }

    @Override
    public void closeFile() {
        System.out.println("WindowsFileSystemReceiver: closeFile()");
    }
}

