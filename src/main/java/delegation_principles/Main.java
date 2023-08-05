package delegation_principles;

// the 'delegate'
class RealPrinter {
    void print() {
        System.out.println("The Delegate");
    }
}

// the 'delegator'
class Printer {
    RealPrinter p = new RealPrinter();
    // create the delegate
    void print() {
        p.print(); // delegation
    }
}

public class Main {
    // To the outside world it looks like Printer actually prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }

}
