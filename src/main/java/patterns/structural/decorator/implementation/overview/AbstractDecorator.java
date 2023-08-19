package patterns.structural.decorator.implementation.overview;

public abstract class AbstractDecorator extends Component {
    protected Component component; // now it can be IN ANY ConcreteDecorator!

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecorator1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add additional functionality
        System.out.println("ConcreteDecorator1: doJob() is doing additional functionality");
    }
}

class ConcreteDecorator2 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add additional functionality
        System.out.println("ConcreteDecorator2: doJob() is doing additional functionality");
    }
}
