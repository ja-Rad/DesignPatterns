package patterns.creational.singleton.challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team");
        System.out.println("New Captain selected for our team");
        Captain c1 = Captain.getInstance();

        System.out.println("Trying to make another captain for our team");
        Captain c2 = Captain.getInstance();
        System.out.println("You already have a captain for your team. Send him for the toss.");

        if (c1.equals(c2)) {
            System.out.println("c1 and c2 are same instances");
        }
    }
}
