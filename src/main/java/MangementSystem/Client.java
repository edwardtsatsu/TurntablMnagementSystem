package MangementSystem;

abstract class Client {
    private final String name;
    private final int id;
    private final ServiceLevel serviceLevel;

    public Client(String name, int id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
