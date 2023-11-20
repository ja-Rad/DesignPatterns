package patterns_example_project.domain.player_status;

import patterns_example_project.domain.player_character.PlayerCharacter;

public abstract class Status {
    PlayerCharacter playerCharacter;

    public Status(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public abstract void checkStatus();
}
