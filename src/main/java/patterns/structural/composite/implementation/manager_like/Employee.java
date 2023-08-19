package patterns.structural.composite.implementation.manager_like;

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
