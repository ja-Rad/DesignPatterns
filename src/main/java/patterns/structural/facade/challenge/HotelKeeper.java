package patterns.structural.facade.challenge;

// Facade
public class HotelKeeper {

    private Hotel hotel;

    public void getVegMenu() {
        hotel = new VegRestaurant();
        Menus hotelMenus = hotel.getMenus();
        hotelMenus.showMenu();
    }

    public void getNonVegMenu() {
        hotel = new NonVegRestaurant();
        Menus hotelMenus = hotel.getMenus();
        hotelMenus.showMenu();
    }

    public void getVegNonBothRestaurant() {
        hotel = new VegNonBothRestaurant();
        Menus hotelMenus = hotel.getMenus();
        hotelMenus.showMenu();
    }
}
