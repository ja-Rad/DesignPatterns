package patterns_example_project.domain;

import patterns_example_project.domain.item_slot.QualityType;

public abstract class ArmorSlot extends ItemSlot {
    protected int armor;

    public ArmorSlot(String name, QualityType type, int price, int armor) {
        super(name, type, price);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
}

