package patterns_example_project.domain.player_status;

import patterns_example_project.domain.player_character.PlayerCharacter;

public class AliveStatus extends Status {
    public AliveStatus(PlayerCharacter playerCharacter) {
        super(playerCharacter);
        System.out.println("PLAYER IS ALIVE");
    }

    @Override
    public void checkStatus() {
        if (playerCharacter.getCharacterInfo().getMainStats().getHealth() <= 0) {
            playerCharacter.setStatus(new ResurrectStatus(playerCharacter));
            System.out.println("PLAYER WAS KILLED");
        }
    }
}
