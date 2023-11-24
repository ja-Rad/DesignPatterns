package patterns_example_project;


import patterns_example_project.domain.client.Client;
import patterns_example_project.domain.enemy.EnemyTypeFactory;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.service.BattleManagerService;
import patterns_example_project.service.CharacterCreationService;
import patterns_example_project.service.QuestService;
import patterns_example_project.service.RegistrationService;
import patterns_example_project.service.ShoppingService;

public class Application {

    public static RegistrationService registrationService = RegistrationService.getInstance();
    public static CharacterCreationService characterCreationService = CharacterCreationService.getInstance();
    public static ShoppingService shoppingService = ShoppingService.getInstance();
    public static QuestService questService = QuestService.getInstance();
    public static BattleManagerService battleManagerService = BattleManagerService.getInstance();

    public static void main(String[] args) throws InterruptedException {
        System.out.print("""
                --------------------------------
                1/5 SIMULATE CLIENT REGISTRATION
                --------------------------------
                """);
        Client client = simulateClientRegistration();

        System.out.print("""
                                
                                
                --------------------------------
                2/5 SIMULATE PLAYER CHARACTER CREATION
                --------------------------------
                """);
        PlayerCharacter playerCharacter = simulatePlayerCharacterCreation(client);
//        playerCharacter.getCharacterInfo().setMainStats(MainStats.of(5L, 5L)); // to get Resurrect status

        for (int i = 1; i <= 1; i++) {

            System.out.println("\n\n================================");
            System.out.println("CYCLE #" + i);
            System.out.println("================================\n\n");
            System.out.print("""
                                    
                                    
                    --------------------------------
                    3/5 SIMULATE QUEST
                    --------------------------------
                    """);
            simulateQuest(playerCharacter);


            System.out.print("""
                                    
                                    
                    --------------------------------
                    4/5 SIMULATE BATTLE
                    --------------------------------
                    """);
            simulateBattle(playerCharacter);

            System.out.print("""
                                    
                                    
                    --------------------------------
                    5/5 SIMULATE PLAYER CHARACTERS SHOPPING
                    --------------------------------
                    """);
            simulatePlayerCharactersShopping(playerCharacter.getId());
            Thread.sleep(2000);

        }
        System.out.println("\nCACHED ENEMY TYPES: " + EnemyTypeFactory.getEnemyTypes());
    }

    private static Client simulateClientRegistration() {
        return registrationService.generateNewClient();
    }

    private static PlayerCharacter simulatePlayerCharacterCreation(Client client) {
        return characterCreationService.generateNewCharacter(client);
    }

    private static void simulatePlayerCharactersShopping(Long id) {
        shoppingService.doShopping(id);
    }

    private static void simulateQuest(PlayerCharacter playerCharacter) {
        questService.generateQuests();
        questService.assignQuest(playerCharacter);
    }

    private static void simulateBattle(PlayerCharacter playerCharacter) {
        battleManagerService.manageBattle(playerCharacter);
    }


}
