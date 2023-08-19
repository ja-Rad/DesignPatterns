package patterns.structural.composite.implementation.directory_like;

// Component. This is used by Client. Common behaviour, accessing Child components.
public interface Employee {
    void showEmployeeDetails();
}

// Leaf/Node
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: " + empId + " " + name + " " + position);
    }
}

// Leaf/Node - because we assume that sometimes it could NOT HAVE developers underneath him, so just a leaf...
class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: " + empId + " " + name + " " + position);
    }
}
