package patterns_example_project.domain.client;

import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.List;
import java.util.Objects;

public class Client {
    private Long id;
    private String login;
    private String password;
    private List<PlayerCharacter> playerCharacters;

    private Client(ClientBuilder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.playerCharacters = builder.playerCharacters;
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(login, client.login) && Objects.equals(password, client.password) && Objects.equals(playerCharacters, client.playerCharacters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, playerCharacters);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PlayerCharacter> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(List<PlayerCharacter> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", playerCharacters=" + playerCharacters +
                '}';
    }

    public static class ClientBuilder {
        private Long id;
        private String login;
        private String password;
        private List<PlayerCharacter> playerCharacters;

        private ClientBuilder() {
        }

        public ClientBuilder(Long id, String login, String password, List<PlayerCharacter> playerCharacters) {
            this.id = id;
            this.login = login;
            this.password = password;
            this.playerCharacters = playerCharacters;
        }

        public ClientBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ClientBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public ClientBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public ClientBuilder setPlayerCharacters(List<PlayerCharacter> playerCharacters) {
            this.playerCharacters = playerCharacters;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
