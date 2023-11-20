package patterns_example_project.domain;

import patterns_example_project.domain.item_slot.QualityType;

public class Bow extends WeaponSlot {
    public Bow(String name, QualityType type, int price, int damage) {
        super(name, type, price, damage);
    }
}
