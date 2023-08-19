package patterns.structural.flyweight.challenge;

import java.util.Random;

public class CounterStrike {

    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        Random random = new Random();
        Player terrorist = factory.getPlayer("T");
        Player counterTerrorist = factory.getPlayer("CT");

        int indexT = 0;
        int indexCT = 0;

        while (true) {
            if (indexT + indexCT == 10) {
                break;
            }
            int randomInt = random.nextInt(2); // from 0 to 1

            if (randomInt == 0) {
                terrorist.assignWeapon(getRandomWeapon());
                terrorist.mission();

                if (indexT != 5) {
                    indexT++;
                }

            } else if (randomInt == 1) {
                counterTerrorist.assignWeapon(getRandomWeapon());
                counterTerrorist.mission();

                if (indexCT != 5) {
                    indexCT++;
                }
            }


        }

    }

    private static String getRandomWeapon() {
        String[] weapons = {"Gut Knife", "Desert Eagle", "AK-47"};
        Random random = new Random();
        int randomWeapon = random.nextInt(3);// from 0 to 2

        return weapons[randomWeapon];
    }

}
