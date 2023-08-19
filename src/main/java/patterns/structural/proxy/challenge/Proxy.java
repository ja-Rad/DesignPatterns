package patterns.structural.proxy.challenge;

import java.util.Arrays;
import java.util.List;

public class Proxy implements Subject {
    private Subject realSubject = new RealSubject();
    private List<String> restrictedSites = Arrays.asList("casino.com", "drugs.org", "night-clubs.io");


    @Override
    public void getInternetConnection(String hostName) throws NotValidHostnameException {
        if (restrictedSites.contains(hostName)) {
            throw new NotValidHostnameException("Access Denied");
        }
        realSubject.getInternetConnection(hostName);
    }
}
