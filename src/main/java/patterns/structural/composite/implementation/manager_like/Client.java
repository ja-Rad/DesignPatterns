package patterns.structural.composite.implementation.manager_like;

public class Client {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Shrek", 100, "Senior Developer");
        Employee dev2 = new Developer("Nicolas", 101, "Principal Developer");
        Employee acc1 = new Developer("Johnny", 100, "Business Analyst");
        Employee acc2 = new Developer("Patrick", 101, "Senior Consultant");

        Manager engManager = new Manager("Pudge", 25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Manager accManager = new Manager("Lion", 65000);
        accManager.addEmployee(acc1);
        accManager.addEmployee(acc2);
        accManager.addEmployee(engManager);

        accManager.showEmployeeDetails();

        /*
            ---------------------
            Manager: Lion 65000.0
            Developer: 100 Johnny Business Analyst
            Developer: 101 Patrick Senior Consultant
            ---------------------
            Manager: Pudge 25000.0
            Developer: 100 Shrek Senior Developer
            Developer: 101 Nicolas Principal Developer
         */

        /*
        HOW IT IS ACTUALLY STRUCTURED NOW:
                   accManager("Lion")
                  /       |         \
               acc1      acc2       engManager
                                    /        \
                                 dev1        dev2
         */


    }
}
