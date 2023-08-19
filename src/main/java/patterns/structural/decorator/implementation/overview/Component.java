package patterns.structural.decorator.implementation.overview;

public abstract class Component {
    public abstract void doJob();
}

// We don`t want to modify this!
class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("ConcreteComponent: doJob() I'm CLOSED FOR MODIFICATION!");
    }
}
