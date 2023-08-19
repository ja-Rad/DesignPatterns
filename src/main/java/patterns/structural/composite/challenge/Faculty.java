package patterns.structural.composite.challenge;

public interface Faculty {
    String getDetails();
}

class Dean implements Faculty {

    private String fullName;
    private String title;

    public Dean(String fullName, String title) {
        this.fullName = fullName;
        this.title = title;
    }

    @Override
    public String getDetails() {
        return this.fullName + " is the " + this.title;
    }
}

class Chair implements Faculty {
    private String fullName;
    private String title;

    public Chair(String fullName, String title) {
        this.fullName = fullName;
        this.title = title;
    }

    @Override
    public String getDetails() {
        return this.fullName + " is the " + this.title;
    }
}

class Professor implements Faculty {
    private String fullName;
    private String title;

    public Professor(String fullName, String title) {
        this.fullName = fullName;
        this.title = title;
    }

    @Override
    public String getDetails() {
        return this.fullName + " is the " + this.title;
    }
}
