package patterns.structural.composite.implementation.directory_like;

import java.util.ArrayList;
import java.util.List;

// Composite. Object that has other leaf Nodes in it.
public class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();


    @Override
    public void showEmployeeDetails() {
        System.out.println("Directory: showEmployeeDetails()");
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    // trade-offs
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
