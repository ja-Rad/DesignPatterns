package patterns.behavioral.template_method.implementation;

public abstract class HouseTemplate {
    // template method, final so subclasses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built...");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron and sand...");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    // default implementation, hook method
    public void buildWindows() {
        System.out.println("Building Glass Windows by default...");
    }
}

class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}

class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }
}
