package patterns.behavioral.memento.implementation;

public class Client {
    public static void main(String[] args) {
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data:\n Shrek \n Nicolas Cage \n");
        System.out.println(fileWriter);
        System.out.println("-----------------------");
        /*
            First Set of Data:
             Shrek
             Nicolas Cage

            -----------------------
         */


        // lets save the file now
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        caretaker.save(fileWriter);


        // now we can write something else
        fileWriter.write("Second Set of Data:\n Pudge \n");
        System.out.println(fileWriter);
        System.out.println("-----------------------");
        /*
            First Set of Data:
             Shrek
             Nicolas Cage
            Second Set of Data:
             Pudge

            -----------------------
         */


        // let's undo to last save
        caretaker.undo(fileWriter);
        System.out.println(fileWriter);
        System.out.println("-----------------------");
        /*
            First Set of Data:
             Shrek
             Nicolas Cage

            -----------------------
         */
    }
}
