package patterns_example_project.repository;

import patterns_example_project.domain.client.Client;
import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacterRepository {
    private final List<PlayerCharacter> playerCharacters = new ArrayList<>();
    private long clientIdCounter = 0;

    private PlayerCharacterRepository() {

    }

    public static PlayerCharacterRepository getInstance() {
        return PlayerCharacterRepository.PlayerCharacterRepositoryHelper.uniqueInstance;
    }

    private Long generateClientId() {
        clientIdCounter++;
        return clientIdCounter;
    }

    public void addPlayerCharacter(Client client, PlayerCharacter playerCharacter) {
        playerCharacter.setId(generateClientId());
        playerCharacter.setClientId(client.getId());
        playerCharacters.add(playerCharacter);
    }

    public PlayerCharacter getPlayerCharacterById(Long id) {
        return playerCharacters.stream()
                .filter(playerCharacter -> id.equals(playerCharacter.getId()))
                .findFirst()
                .orElse(null);
    }

    private static class PlayerCharacterRepositoryHelper {
        private static final PlayerCharacterRepository uniqueInstance = new PlayerCharacterRepository();
    }
}
