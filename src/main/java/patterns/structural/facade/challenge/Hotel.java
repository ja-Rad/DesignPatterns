package patterns.structural.facade.challenge;

public interface Hotel {
    Menus getMenus();
}

class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}

class VegNonBothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new Both();
    }
}

class VegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}