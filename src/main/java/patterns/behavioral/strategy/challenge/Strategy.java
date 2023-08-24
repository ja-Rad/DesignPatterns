package patterns.behavioral.strategy.challenge;

public interface Strategy {
    int performOperation(int num1, int num2);
}

class OperationAdd implements Strategy {

    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubtract implements Strategy {

    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiple implements Strategy {

    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
