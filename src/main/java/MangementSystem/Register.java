package MangementSystem;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    //a collection of both corporate and private clients
    private final List<Client> client;

    public Register(List<Client> client) {
        this.client = client;
    }

    public List<String> listOfContactNamesOfGold(){
        return client.stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD)).map(Client::getName).collect(Collectors.toList());
    }

    public Optional<String>  getClientNameById(int id){
        return client.stream().filter(client -> client.getId() == id).map(Client::getName).findFirst();
    }

    public Long allClientAtGoldServiceLevel(){
        return client.stream().filter(client -> client.getServiceLevel() == ServiceLevel.GOLD).count();
    }

    public Long allClientAtPlatinumServiceLevel(){
        return client.stream().filter(client -> client.getServiceLevel() == ServiceLevel.PLATINUM).count();
    }

    public Long allClientAtPremiumServiceLevel(){
        return client.stream().filter(client -> client.getServiceLevel() == ServiceLevel.PREMIUM).count();
    }


    @Override
    public String toString() {
        return "Register{" +
                "client=" + client +
                '}';
    }
}
