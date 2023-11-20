package patterns_example_project.domain.game_shop;

import patterns_example_project.domain.ItemSlot;
import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class GameShop {
    PlayerCharacter playerCharacter;

    public GameShop(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public void doShopping() {
        doGreeting();

        if (hasPlayerAccessToTier2(playerCharacter)) {
            List<? extends ItemSlot> tier2ItemSlots = getTier2ItemSlots();
            ArrayList<? extends ItemSlot> shuffledSlots = new ArrayList<>(tier2ItemSlots);// immutable to mutable
            Collections.shuffle(shuffledSlots);
            buyTier2Item(playerCharacter, shuffledSlots);

        } else if (hasPlayerAccessToTier1(playerCharacter)) {
            List<? extends ItemSlot> tier1ItemSlots = getTier1ItemSlots();
            ArrayList<? extends ItemSlot> shuffledSlots = new ArrayList<>(tier1ItemSlots);// immutable to mutable
            Collections.shuffle(shuffledSlots);
            buyTier1Item(playerCharacter, shuffledSlots);

        } else {
            System.out.println("You don`t have enough gold");
        }

        doFarewell();
    }

    abstract void buyTier2Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier2ItemSlots);

    abstract void buyTier1Item(PlayerCharacter playerCharacter, List<? extends ItemSlot> tier1ItemSlots);

    abstract List<? extends ItemSlot> getTier1ItemSlots();

    abstract List<? extends ItemSlot> getTier2ItemSlots();

    abstract boolean hasPlayerAccessToTier2(PlayerCharacter playerCharacter);

    abstract boolean hasPlayerAccessToTier1(PlayerCharacter playerCharacter);

    abstract void doFarewell();

    abstract void doGreeting();

}
