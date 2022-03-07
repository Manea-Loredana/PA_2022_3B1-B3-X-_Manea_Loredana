
public class Router extends Node implements Identifiable {
    private String address;


    public Router(){

    }
    public Router(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Router{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public String getAddress() {
        return null;
    }
}