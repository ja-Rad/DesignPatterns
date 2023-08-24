package patterns.behavioral.interpreter.implementation;

/*
    Users input:

    "<Number> in Binary" or
    "<Number> in Hexadecimal"

    Our output:
    <Binary number>
    <Hex number>
 */


public class InterpreterContext {
    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
