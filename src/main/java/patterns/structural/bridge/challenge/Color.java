package patterns.structural.bridge.challenge;

public interface Color {
    void fillWithColor(int borderSize);
}

class GreenColor implements Color {
    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("Green Color with " + borderSize + " inch border.");
    }
}

class RedColor implements Color {

    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("Red Color with " + borderSize + " inch border.");
    }
}

