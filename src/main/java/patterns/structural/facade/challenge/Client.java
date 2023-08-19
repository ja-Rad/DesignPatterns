package patterns.structural.facade.challenge;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();

        hotelKeeper.getVegMenu();
        System.out.println("-----------------------------");

        hotelKeeper.getNonVegMenu();
        System.out.println("-----------------------------");

        hotelKeeper.getVegNonBothRestaurant();
    }
}
