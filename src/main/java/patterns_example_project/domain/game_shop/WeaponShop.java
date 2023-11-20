package patterns_example_project.domain.game_shop;

import patterns_example_project.domain.ItemSlot;
import patterns_example_project.domain.Sword;
import patterns_example_project.domain.WeaponSlot;
import patterns_example_project.domain.item_slot.QualityType;
import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.List;

public class WeaponShop extends GameShop {
    private final List<WeaponSlot> tier1Weapons = List.of(
            new Sword("Wooden Sword", QualityType.COMMON, 400, 2),
            new Sword("Iron Sword", QualityType.COMMON, 800, 5)
    );

    private final List<WeaponSlot> tier2Weapons = List.of(
            new Sword("Diamond Sword", QualityType.RARE, 2800, 10)
    );

    public WeaponShop(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    @Override
    void buyTier2Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier2ItemSlots) {
        ItemSlot anyItemSlot = tier2ItemSlots.stream()
                .filter(itemSlot -> itemSlot.getPrice() <= playerCharacter.getGold())
                .findAny()
                .orElse(null);

        if (anyItemSlot instanceof WeaponSlot weaponSlot) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setWeaponSlot(weaponSlot);
            System.out.println("Player buys weapon: " + weaponSlot + " for " + anyItemSlot.getPrice());
        }
    }

    @Override
    void buyTier1Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier1ItemSlots) {
        ItemSlot anyItemSlot = tier1ItemSlots.stream()
                .filter(itemSlot -> itemSlot.getPrice() <= playerCharacter.getGold())
                .findAny()
                .orElse(null);

        if (anyItemSlot instanceof WeaponSlot weaponSlot) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setWeaponSlot(weaponSlot);
            System.out.println("Player buys weapon: " + weaponSlot + " for " + anyItemSlot.getPrice());
        }
    }

    @Override
    List<? extends ItemSlot> getTier1ItemSlots() {
        return tier1Weapons;
    }

    @Override
    List<? extends ItemSlot> getTier2ItemSlots() {
        return tier2Weapons;
    }

    @Override
    boolean hasPlayerAccessToTier2(PlayerCharacter playerCharacter) {
        return playerCharacter.getGold() > 5000;
    }

    @Override
    boolean hasPlayerAccessToTier1(PlayerCharacter playerCharacter) {
        return playerCharacter.getGold() > 1000;
    }

    @Override
    void doFarewell() {
        System.out.println("WeaponShop - COME AGAIN.");
    }

    @Override
    public void doGreeting() {
        System.out.println("WeaponShop - THEY'RE MASTERWORKS ALL, YOU CAN'T GO WRONG.");
    }
}
