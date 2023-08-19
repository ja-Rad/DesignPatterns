package patterns.structural.composite.implementation.manager_like;

import java.util.ArrayList;
import java.util.List;

// Composite. Object that has other leaf Nodes in it.
public class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("---------------------");
        System.out.println("Manager: " + this.name + " " + this.salary);
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // trade-offs
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
