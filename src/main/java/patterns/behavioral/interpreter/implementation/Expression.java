package patterns.behavioral.interpreter.implementation;

public interface Expression {
    String interpret(InterpreterContext interpreterContext);
}

// Terminal Expression 1
class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}

// Terminal Expression 2
class IntToHexadecimalExpression implements Expression {

    private int i;

    public IntToHexadecimalExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(i);
    }
}
