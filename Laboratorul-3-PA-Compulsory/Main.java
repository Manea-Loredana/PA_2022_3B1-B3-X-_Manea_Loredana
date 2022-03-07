public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("A", 32);
        Computer computer2 = new Computer("B", 1000);
        Computer computer3 = new Computer("C", 1000);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
        Router router1 = new Router("A");
        System.out.println(router1);
        Switch switch1 = new Switch();
        System.out.println(switch1);
    }
}
