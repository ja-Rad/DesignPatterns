package patterns.structural.composite.implementation.directory_like;

public class Client {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Shrek", 100, "Senior Developer");
        Employee dev2 = new Developer("Nicolas", 101, "Principal Developer");

        Employee manager1 = new Manager("Pudge", 200, "SEO Manager");
        Employee manager2 = new Manager("Lion", 201, "Project Manager");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(manager1);
        accDirectory.addEmployee(manager2);


        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
        /*
            Directory: showEmployeeDetails()
            Directory: showEmployeeDetails()
            Developer: 100 Shrek Senior Developer
            Developer: 101 Nicolas Principal Developer
            Directory: showEmployeeDetails()
            Manager: 200 Pudge SEO Manager
            Manager: 201 Lion Project Manager
         */

        /*
        HOW IT IS ACTUALLY STRUCTURED NOW:
                  companyDirectory
                    /       \
           engDirectory    accDirectory
           /       \         /      \
        Shrek     Nicolas  Pudge    Lion
         */


    }
}
