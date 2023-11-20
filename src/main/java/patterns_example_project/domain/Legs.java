package patterns_example_project.domain;

import patterns_example_project.domain.item_slot.QualityType;

public class Legs extends ArmorSlot {
    public Legs(String name, QualityType type, int price, int armor) {
        super(name, type, price, armor);
    }
}
