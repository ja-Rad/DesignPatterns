package patterns.behavioral.strategy.challenge;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int addition = context.executeStrategy(new OperationAdd(), 1, 2);
        System.out.println(addition); // 3

        int subtraction = context.executeStrategy(new OperationSubtract(), 1, 2);
        System.out.println(subtraction); // -1

        int multiplication = context.executeStrategy(new OperationMultiple(), 1, 2);
        System.out.println(multiplication); // 2
    }
}
