package patterns.structural.flyweight.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class PlayerFactory {
    private Map<String, Player> playersCache = new HashMap<>();

    public Player getPlayer(String playerType) {
        Player player = null;

        if (!playersCache.containsKey(playerType)) {
            switch (playerType) {
                case "T":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    playersCache.put("T", player);
                    break;

                case "CT":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    playersCache.put("CT", player);
                    break;

                default:
                    throw new NoSuchElementException("There is only 'T' and 'CT' player types");
            }
        }
        player = playersCache.get(playerType);
        return player;
    }
}
