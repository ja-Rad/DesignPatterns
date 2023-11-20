package patterns_example_project.domain.player_character;

import patterns_example_project.domain.CharacterSlots;
import patterns_example_project.domain.battle.BattleListener;
import patterns_example_project.domain.battle.PlayerListener;
import patterns_example_project.domain.player_status.AliveStatus;
import patterns_example_project.domain.player_status.Status;
import patterns_example_project.domain.quest.Quest;

import java.util.Objects;

public class PlayerCharacter {
    private Long id;
    private Long clientId;
    private String username;
    private int level;
    private CharacterSlots characterSlots;
    private Quest currentQuest;
    private PlayerCharacterInfo characterInfo;
    private Status status;
    private int gold;
    private BattleListener listener;

    private PlayerCharacter(PlayerCharacterBuilder builder) {
        this.status = new AliveStatus(this);
        this.listener = new PlayerListener();

        this.id = builder.id;
        this.clientId = builder.clientId;
        this.username = builder.username;
        this.level = builder.level;
        this.characterSlots = builder.characterSlots;
        this.characterInfo = builder.characterInfo;
        this.gold = builder.gold;
    }

    public static PlayerCharacterBuilder builder() {
        return new PlayerCharacterBuilder();
    }

    public BattleListener getListener() {
        return listener;
    }

    public void setListener(BattleListener listener) {
        this.listener = listener;
    }

    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "id='" + id + '\'' +
                ", clientId=" + clientId +
                ", username=" + username +
                ", level=" + level +
                ", characterSlots=" + characterSlots +
                ", currentQuest=" + currentQuest +
                ", characterInfo=" + characterInfo +
                ", status=" + status +
                ", gold=" + gold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerCharacter that = (PlayerCharacter) o;
        return level == that.level && Objects.equals(id, that.id) && Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) && Objects.equals(characterSlots, that.characterSlots) && Objects.equals(currentQuest, that.currentQuest) && Objects.equals(characterInfo, that.characterInfo) && Objects.equals(status, that.status) && Objects.equals(gold, that.gold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, username, level, characterSlots, currentQuest, characterInfo, status, gold);
    }

    public PlayerCharacterInfo getCharacterInfo() {
        return characterInfo;
    }

    public void setCharacterInfo(PlayerCharacterInfo characterInfo) {
        this.characterInfo = characterInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CharacterSlots getCharacterSlots() {
        return characterSlots;
    }

    public void setCharacterSlots(CharacterSlots characterSlots) {
        this.characterSlots = characterSlots;
    }

    public Quest getCurrentQuest() {
        return currentQuest;
    }

    public void setCurrentQuest(Quest currentQuest) {
        this.currentQuest = currentQuest;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public static class PlayerCharacterBuilder {
        private Long id;
        private Long clientId;
        private String username;
        private int level;
        private CharacterSlots characterSlots;
        private PlayerCharacterInfo characterInfo;
        private int gold;
        private Status status;

        private PlayerCharacterBuilder() {

        }

        public PlayerCharacterBuilder(Long id, Long clientId, String username, int level, CharacterSlots characterSlots, PlayerCharacterInfo characterInfo, int gold, Status status) {
            this.id = id;
            this.clientId = clientId;
            this.username = username;
            this.level = level;
            this.characterSlots = characterSlots;
            this.characterInfo = characterInfo;
            this.gold = gold;
            this.status = status;
        }

        public PlayerCharacterBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public PlayerCharacterBuilder setClientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        public PlayerCharacterBuilder setStatus(Status status) {
            this.status = status;
            return this;
        }

        public PlayerCharacterBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public PlayerCharacterBuilder setLevel(int level) {
            this.level = level;
            return this;
        }

        public PlayerCharacterBuilder setCharacterSlots(CharacterSlots characterSlots) {
            this.characterSlots = characterSlots;
            return this;
        }

        public PlayerCharacterBuilder setCharacterInfo(PlayerCharacterInfo characterInfo) {
            this.characterInfo = characterInfo;
            return this;
        }

        public PlayerCharacterBuilder setGold(int gold) {
            this.gold = gold;
            return this;
        }

        public PlayerCharacter build() {
            return new PlayerCharacter(this);
        }
    }
}
