package patterns_example_project.service;

import patterns_example_project.domain.game_shop.ArmorShop;
import patterns_example_project.domain.game_shop.GameShop;
import patterns_example_project.domain.game_shop.WeaponShop;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.repository.PlayerCharacterRepository;

import java.util.Random;

public class ShoppingService {
    private static PlayerCharacterRepository playerCharacterRepository = PlayerCharacterRepository.getInstance();
    private static Random random = new Random();
    private GameShop shop;

    private ShoppingService() {
    }

    public static ShoppingService getInstance() {
        return ShoppingService.ShoppingServiceHelper.uniqueInstance;
    }

    private static String getPlayerChoice() {
        String playerChoice = "";
        int randomInt = random.nextInt(2); // Generating random values from 0 - 1
        if (randomInt == 0) {
            playerChoice = "ARMOR_SHOP";
        } else if (randomInt == 1) {
            playerChoice = "WEAPON_SHOP";
        }
        return playerChoice;
    }

    public void doShopping(Long id) {
        PlayerCharacter playerCharacter = playerCharacterRepository.getPlayerCharacterById(id);
        String playerChoice = getPlayerChoice();

        if ("ARMOR_SHOP".equals(playerChoice)) {
            System.out.println("Player goes to Armor Shop...");
            shop = new ArmorShop(playerCharacter);
            shop.doShopping();

        } else if ("WEAPON_SHOP".equals(playerChoice)) {
            System.out.println("Player goes to Weapon Shop...");
            shop = new WeaponShop(playerCharacter);
            shop.doShopping();
        }
    }

    private static class ShoppingServiceHelper {
        private static final ShoppingService uniqueInstance = new ShoppingService();
    }
}
