package patterns_example_project.domain.battle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BattlePublisher {
    Map<Long, List<BattleListener>> listeners = new HashMap<>();

    public BattlePublisher(Long... battleIds) {
        for (Long battleId : battleIds) {
            this.listeners.put(battleId, new ArrayList<>());
        }
    }

    public void subscribe(Long battleId, BattleListener listener) {
        List<BattleListener> logListeners = listeners.get(battleId);
        logListeners.add(listener);
    }

    public void unsubscribe(Long battleId, BattleListener listener) {
        List<BattleListener> logListeners = listeners.get(battleId);
        logListeners.remove(listener);
    }

    public void notify(Long battleId, String notification) {
        List<BattleListener> logListeners = listeners.get(battleId);
        for (BattleListener listener : logListeners) {
            listener.update(battleId, notification);
        }
    }
}
