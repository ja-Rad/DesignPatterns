package patterns_example_project.domain;

import patterns_example_project.domain.item_slot.QualityType;

public class Boots extends ArmorSlot {
    public Boots(String name, QualityType type, int price, int armor) {
        super(name, type, price, armor);
    }
}
