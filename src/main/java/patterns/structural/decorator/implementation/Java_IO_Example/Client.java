package patterns.structural.decorator.implementation.Java_IO_Example;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        int c;

        StringBuffer stringBuffer = new StringBuffer("afsafsaffAFFAFAFSAfafsfasAAAAAAfafsfvvBBB");
        byte[] bytes = stringBuffer.toString().getBytes();

        // LowerCaseInputStream - Concrete Decorator that extends FilterInputStream Abstr Decorator
        try {
            LowerCaseInputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}