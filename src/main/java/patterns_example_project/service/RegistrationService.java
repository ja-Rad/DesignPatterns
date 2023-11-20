package patterns_example_project.service;


import patterns_example_project.domain.client.Client;
import patterns_example_project.repository.ClientRepository;

import java.util.Random;

public class RegistrationService {
    private static final ClientRepository clientRepository = ClientRepository.getInstance();
    private static final Random random = new Random();

    private RegistrationService() {
    }

    public static RegistrationService getInstance() {
        return RegistrationService.RegistrationServiceHelper.uniqueInstance;
    }

    public Client generateNewClient() {
        Client newClient = Client.builder()
                .setLogin(generateRandomString(10))
                .setPassword(generateRandomString(10))
                .build();

        clientRepository.addClient(newClient);
        System.out.println("New client has been created: " + newClient);
        return newClient;
    }

    private String generateRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static class RegistrationServiceHelper {
        private static final RegistrationService uniqueInstance = new RegistrationService();
    }
}
