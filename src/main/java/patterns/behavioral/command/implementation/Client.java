package patterns.behavioral.command.implementation;

public class Client {

    // Receiver -> Command(HAS A Receiver) -> Invoker(HAS A Command)
    public static void main(String[] args) {
        // creating the receiver
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem(); // Underlying OS is: Windows 10

        // create the command with the associating receiver
        Command openFileCommand = new OpenFileCommand(fileSystemReceiver);

        // create the invoker and associate it with the command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        // perform action on invoker object
        fileInvoker.execute(); // WindowsFileSystemReceiver: openFile()

        Command writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute(); // WindowsFileSystemReceiver: writeFile()

        Command closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute(); // WindowsFileSystemReceiver: closeFile()

    }
}
