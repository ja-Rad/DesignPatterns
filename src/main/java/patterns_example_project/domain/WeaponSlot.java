package patterns_example_project.domain;

import patterns_example_project.domain.item_slot.QualityType;

public abstract class WeaponSlot extends ItemSlot {
    protected int damage;

    public WeaponSlot(String name, QualityType type, int price, int damage) {
        super(name, type, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

