package patterns.creational.abstract_factory.implementation;

public interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red: fill()");
    }
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green: fill()");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue: fill()");
    }
}
