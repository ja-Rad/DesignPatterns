package patterns.behavioral.interpreter.implementation;

public class Client {

    private InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public static void main(String[] args) {
        String example1 = "28 in Binary";
        String example2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(client.interpret(example1)); // 11100
        System.out.println(client.interpret(example2)); // 1c
    }

    // This pattern DOESN'T DO PARSING! So we need to create parsing on our own.
    public String interpret(String s) {
        Expression expression;
        int i = Integer.parseInt(s.substring(0, s.indexOf(" ")));

        if (s.contains("Hex")) {
            expression = new IntToHexadecimalExpression(i);
        } else if (s.contains("Bin")) {
            expression = new IntToBinaryExpression(i);
        } else {
            return s;
        }

        return expression.interpret(interpreterContext);
    }
}
