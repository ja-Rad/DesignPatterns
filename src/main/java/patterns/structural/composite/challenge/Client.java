package patterns.structural.composite.challenge;

public class Client {
    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Dr.S.Som", "Dean of Technology");

        Supervisor chairOfMathDep = new Supervisor("Mrs.S.Das", "Chair of Math Department");
        Supervisor chairOfCompDep = new Supervisor("Mr.V.Sarcar", "Chair of Computer Science Department");

        Professor mathProf1 = new Professor("Math Professor1", "Adjunct");
        Professor mathProf2 = new Professor("Math Professor2", "Associate");

        Professor cseProf1 = new Professor("CSE Professor1", "Adjunct");
        Professor cseProf2 = new Professor("CSE Professor2", "Professor");
        Professor cseProf3 = new Professor("CSE Professor3", "Professor");


        techDean.addMember(chairOfMathDep);
        techDean.addMember(chairOfCompDep);

        chairOfMathDep.addMember(mathProf1);
        chairOfMathDep.addMember(mathProf2);

        chairOfCompDep.addMember(cseProf1);
        chairOfCompDep.addMember(cseProf2);
        chairOfCompDep.addMember(cseProf3);

        System.out.println(techDean.getDetails());
        for (Faculty chairs : techDean.getFacultyMembers()) {
            System.out.println("\t" + chairs.getDetails());
        }
        for (Faculty mathProfs : chairOfMathDep.getFacultyMembers()) {
            System.out.println("\t\t" + mathProfs.getDetails());
        }
        for (Faculty cseProfs : chairOfCompDep.getFacultyMembers()) {
            System.out.println("\t\t" + cseProfs.getDetails());
        }
        System.out.println("-----------------------------------------");
        System.out.println("Removing 2nd professor");
        chairOfCompDep.removeMember(cseProf2);
        for (Faculty cseProfs : chairOfCompDep.getFacultyMembers()) {
            System.out.println("\t\t" + cseProfs.getDetails());
        }
    }
}
