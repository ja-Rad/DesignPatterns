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

            System.out.println("~~~PLAYER SPENDS 1000 gold to RESURRECT IMMEDIATELY~~~");

        } else {
            try {
                System.out.println("~~~WAIT 2 seconds FOR RESURRECTION~~~");
                Thread.sleep(2000);
                playerCharacter.getCharacterInfo().setMainStats(MainStats.of(500L, 1000L));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("~~~PLAYER WAS RESURRECTED~~~");
    }
}
