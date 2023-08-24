package patterns.behavioral.interpreter.challenge;

public interface Expression {
    boolean interpret(Context context);
}

// Terminal Concrete Class
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
