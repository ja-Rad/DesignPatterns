package patterns.structural.decorator.implementation.Java_IO_Example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// LowerCaseInputStream - Concrete Decorator
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int charIndex = this.in.read();

        if (charIndex == -1) {
            return charIndex;
        } else {
            return Character.toLowerCase(charIndex);
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);

        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
