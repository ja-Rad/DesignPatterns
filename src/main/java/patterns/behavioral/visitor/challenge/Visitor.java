package patterns.behavioral.visitor.challenge;

public interface Visitor {
    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    double getTotalPostageForCart();
}

class USPostageVisitor implements Visitor {

    private double totalPostageForCart;

    // return the internal state
    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }

    // collect data about the book
    @Override
    public void visit(Book book) {
        // free postage for a book over 20$
        if (book.getPrice() < 20.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        // free postage for a cd over 20$
        if (cd.getPrice() < 20.0) {
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        // free postage for a dvd over 20$
        if (dvd.getPrice() < 20.0) {
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }
}

class SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageForCart;

    // return the internal state
    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }

    @Override
    public void visit(Book book) {
        // free postage for a book over 30$
        if (book.getPrice() < 30.0) {
            totalPostageForCart += book.getWeight() * 2 * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        // free postage for a cd over 30$
        if (cd.getPrice() < 30.0) {
            totalPostageForCart += cd.getWeight() * 2.5 * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        // free postage for a dvd over 30$
        if (dvd.getPrice() < 30.0) {
            totalPostageForCart += dvd.getWeight() * 3 * 2;
        }
    }
}
