package patterns_example_project.service;

import patterns_example_project.domain.CharacterSlots;
import patterns_example_project.domain.client.Client;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.domain.player_character.PlayerCharacterInfo;
import patterns_example_project.domain.player_class.Mage;
import patterns_example_project.domain.player_class.PlayerClass;
import patterns_example_project.domain.player_class.Warrior;
import patterns_example_project.repository.PlayerCharacterRepository;

import java.util.Random;

public class CharacterCreationService {
    private static final Random random = new Random();
    private static PlayerCharacterRepository playerCharacterRepository = PlayerCharacterRepository.getInstance();

    private CharacterCreationService() {

    }

    public static CharacterCreationService getInstance() {
        return CharacterCreationService.CharacterCreationServiceHelper.uniqueInstance;
    }

    public PlayerCharacter generateNewCharacter(Client client) {
        PlayerCharacter playerCharacter = PlayerCharacter.builder()
                .setUsername(generateRandomString(15))
                .setLevel(1)
                .setGold(100)
                .setCharacterSlots(CharacterSlots.builder().build())
                .setCharacterInfo(PlayerCharacterInfo.builder()
                        .setPlayerClass(getRandomClass())
                        .build())
                .build();

        playerCharacterRepository.addPlayerCharacter(client, playerCharacter);

        System.out.println("New Player Character for the client with login: " + client.getLogin() + " has been created: " + playerCharacter);
        return playerCharacter;
    }

    private PlayerClass getRandomClass() {
        int nextInt = random.nextInt(2);// 0-1
        if (nextInt == 0) {
            return new Warrior();
        } else {
            return new Mage();
        }
    }

    private String generateRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static class CharacterCreationServiceHelper {
        private static final CharacterCreationService uniqueInstance = new CharacterCreationService();
    }

}
