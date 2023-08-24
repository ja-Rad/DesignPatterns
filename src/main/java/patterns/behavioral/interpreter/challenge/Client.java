package patterns.behavioral.interpreter.challenge;

public class Client {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context context1 = new Context("John");
        System.out.println("Is John a male? " + isMale.interpret(context1)); // Is John a male? true

        Context context2 = new Context("Married Julie");
        System.out.println("Is Julie married? " + isMarriedWoman.interpret(context2)); // Is Julie married? true

        Context context3 = new Context("Doe");
        System.out.println("Is Doe a male? " + isMale.interpret(context3)); // Is Doe a male? false
    }
}
