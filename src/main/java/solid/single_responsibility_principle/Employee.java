package solid.single_responsibility_principle;

import java.util.Date;

// This class BREAKS Single Responsibility Principle
// Because:
// isPromotionDueThisYear changes every few years. They are HR changes that happen frequently. MOVE IT TO HR and pass employee to func
// calcIncome the same thing. It is a response for a financial department. MOVE IT TO Finance and pass employee to func

// NOW IT IS adhered to Single Responsibility Principle
public class Employee {
    private String employeeId;
    private String name;
    private Date dateOfJoining;

//    public boolean isPromotionDueThisYear() {
//        // promotion logic
//    }

//    public double calcIncome() {
//
//    }

    // getters / setters for class fields
}
