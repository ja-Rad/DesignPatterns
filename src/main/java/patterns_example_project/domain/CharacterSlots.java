package patterns_example_project.domain;

import java.util.Objects;

public class CharacterSlots {
    private WeaponSlot weaponSlot;
    private Head head;
    private Chest chest;
    private Boots boots;
    private Legs legs;

    private CharacterSlots(CharacterSlotsBuilder builder) {
        this.weaponSlot = builder.weaponSlot;
        this.head = builder.head;
        this.chest = builder.chest;
        this.boots = builder.boots;
        this.legs = builder.legs;
    }

    public static CharacterSlotsBuilder builder() {
        return new CharacterSlotsBuilder();
    }

    public WeaponSlot getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(WeaponSlot weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "CharacterSlots{" +
                "weaponSlot=" + weaponSlot +
                ", head=" + head +
                ", chest=" + chest +
                ", boots=" + boots +
                ", legs=" + legs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterSlots that = (CharacterSlots) o;
        return Objects.equals(weaponSlot, that.weaponSlot) && Objects.equals(head, that.head) && Objects.equals(chest, that.chest) && Objects.equals(boots, that.boots) && Objects.equals(legs, that.legs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponSlot, head, chest, boots, legs);
    }

    public static class CharacterSlotsBuilder {
        private WeaponSlot weaponSlot;
        private Head head;
        private Chest chest;
        private Boots boots;
        private Legs legs;

        private CharacterSlotsBuilder() {
        }

        public CharacterSlotsBuilder(WeaponSlot weaponSlot, Head head, Chest chest, Boots boots, Legs legs) {
            this.weaponSlot = weaponSlot;
            this.head = head;
            this.chest = chest;
            this.boots = boots;
            this.legs = legs;
        }

        public CharacterSlotsBuilder setWeaponSlot(WeaponSlot weaponSlot) {
            this.weaponSlot = weaponSlot;
            return this;
        }

        public CharacterSlotsBuilder setHead(Head head) {
            this.head = head;
            return this;
        }

        public CharacterSlotsBuilder setChest(Chest chest) {
            this.chest = chest;
            return this;
        }

        public CharacterSlotsBuilder setBoots(Boots boots) {
            this.boots = boots;
            return this;
        }

        public CharacterSlotsBuilder setLegs(Legs legs) {
            this.legs = legs;
            return this;
        }

        public CharacterSlots build() {
            return new CharacterSlots(this);
        }
    }
}
