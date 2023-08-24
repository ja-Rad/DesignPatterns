package patterns.behavioral.iterator.challenge;

public class Client {
    static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Subject scienceSubject = new Science();
        Subject artsSubject = new Arts();

        Iterator scienceIterator = scienceSubject.createIterator();
        Iterator artsIterator = artsSubject.createIterator();

        print(scienceIterator);
        /*
            Maths
            Comp. Sc.
            Physics
         */
        System.out.println("--------------------------");
        print(artsIterator);
        /*
            Bengali
            English
         */
    }
}
