package patterns_example_project.repository;

import patterns_example_project.domain.client.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    private final List<Client> clients = new ArrayList<>();
    private long clientIdCounter = 0;

    private ClientRepository() {

    }

    public static ClientRepository getInstance() {
        return ClientRepository.ClientRepositoryHelper.uniqueInstance;
    }

    public void addClient(Client client) {
        client.setId(generateClientId());
        clients.add(client);
    }

    public List<Client> getRegisteredClients() {
        return clients;
    }

    private Long generateClientId() {
        clientIdCounter++;
        return clientIdCounter;
    }

    public Client getClientById(Long id) {
        return clients.stream()
                .filter(client -> id.equals(client.getId()))
                .findFirst()
                .orElse(null);
    }

    private static class ClientRepositoryHelper {
        private static final ClientRepository uniqueInstance = new ClientRepository();
    }

}
