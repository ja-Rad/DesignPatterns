package patterns_example_project.domain.game_shop;

import patterns_example_project.domain.ArmorSlot;
import patterns_example_project.domain.Boots;
import patterns_example_project.domain.Chest;
import patterns_example_project.domain.Head;
import patterns_example_project.domain.ItemSlot;
import patterns_example_project.domain.Legs;
import patterns_example_project.domain.item_slot.QualityType;
import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.List;

public class ArmorShop extends GameShop {
    private final List<ArmorSlot> tier1Armor = List.of(
            new Head("Leather Helmet", QualityType.COMMON, 700, 1),
            new Chest("Leather Chest", QualityType.COMMON, 2500, 3),
            new Legs("Leather Legs", QualityType.COMMON, 1000, 2),
            new Boots("Leather Boots", QualityType.COMMON, 700, 1)
    );
    private final List<ArmorSlot> tier2Armor = List.of(
            new Head("Iron Helmet", QualityType.COMMON, 1700, 3),
            new Chest("Iron Chest", QualityType.COMMON, 4500, 7),
            new Legs("Iron Legs", QualityType.COMMON, 3000, 4),
            new Boots("Iron Boots", QualityType.COMMON, 2700, 3)
    );

    public ArmorShop(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    private static void equipPlayerWithArmor(PlayerCharacter playerCharacter, ItemSlot anyItemSlot) {
        if (anyItemSlot instanceof Head head) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setHead(head);
            System.out.println("Player buys head: " + head + " for " + anyItemSlot.getPrice());
        } else if (anyItemSlot instanceof Chest chest) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setChest(chest);
            System.out.println("Player buys chest: " + chest + " for " + anyItemSlot.getPrice());
        } else if (anyItemSlot instanceof Legs legs) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setLegs(legs);
            System.out.println("Player buys legs: " + legs + " for " + anyItemSlot.getPrice());
        } else if (anyItemSlot instanceof Boots boots) {
            playerCharacter.setGold(playerCharacter.getGold() - anyItemSlot.getPrice());
            playerCharacter.getCharacterSlots().setBoots(boots);
            System.out.println("Player buys boots: " + boots + " for " + anyItemSlot.getPrice());
        }
    }

    @Override
    void buyTier2Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier2ItemSlots) {
        ItemSlot anyItemSlot = tier2ItemSlots.stream()
                .filter(itemSlot -> itemSlot.getPrice() <= playerCharacter.getGold())
                .findAny()
                .orElse(null);

        equipPlayerWithArmor(playerCharacter, anyItemSlot);
    }

    @Override
    void buyTier1Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier1ItemSlots) {
        ItemSlot anyItemSlot = tier1ItemSlots.stream()
                .filter(itemSlot -> itemSlot.getPrice() <= playerCharacter.getGold())
                .findAny()
                .orElse(null);

        equipPlayerWithArmor(playerCharacter, anyItemSlot);
    }

    @Override
    List<? extends ItemSlot> getTier1ItemSlots() {
        return tier1Armor;
    }

    @Override
    List<? extends ItemSlot> getTier2ItemSlots() {
        return tier2Armor;
    }

    @Override
    boolean hasPlayerAccessToTier2(PlayerCharacter playerCharacter) {
        return playerCharacter.getGold() > 2000;
    }

    @Override
    boolean hasPlayerAccessToTier1(PlayerCharacter playerCharacter) {
        return playerCharacter.getGold() > 500;
    }

    @Override
    void doFarewell() {
        System.out.println("ArmorShop - HOPE TO SEE YOU SOON!");
    }

    @Override
    void doGreeting() {
        System.out.println("ArmorShop - YES, WELL, ENOUGH IDLE CHATTER. TO BUSINESS, THEN?");
    }
}
