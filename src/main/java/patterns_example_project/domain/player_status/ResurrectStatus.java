package patterns_example_project.domain.player_status;

import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.domain.player_character.PlayerCharacterInfo;
import patterns_example_project.domain.player_class.MainStats;

public class ResurrectStatus extends Status {
    public ResurrectStatus(PlayerCharacter playerCharacter) {
        super(playerCharacter);

        PlayerCharacterInfo characterInfo = playerCharacter.getCharacterInfo();
        characterInfo.setMainStats(MainStats.of(0L, 0L));
    }

    @Override
    public void checkStatus() {
        if (playerCharacter.getGold() >= 1000) {
            playerCharacter.setGold(playerCharacter.getGold() - 1000);
            playerCharacter.setStatus(new AliveStatus(playerCharacter));

        } else if (playerCharacter.getLevel() >= 1) {
            playerCharacter.setLevel(playerCharacter.getLevel() - 1);
            playerCharacter.setStatus(new AliveStatus(playerCharacter));

        } else {
            try {
                System.out.println("WAIT 5 seconds FOR RES");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("PLAYER WAS RESURRECTED");
    }
}
