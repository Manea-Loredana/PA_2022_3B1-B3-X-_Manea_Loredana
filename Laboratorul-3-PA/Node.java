import java.util.HashMap;
import java.util.Map;

public abstract class Node implements Comparable<Node> {
    private String name;
    private Map<Node, Integer> cost = new HashMap<>();
    //… constructors, getters, setters

    public Node() {

    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Node, Integer> cost) {
        this.cost = cost;
    }

    public void setCost(Node node, int value) {
        cost.put(node, value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    //… toString, etc.
    @Override
    public int compareTo(Node other) {
        return this.name.compareTo(other.name);
        //not safe, check if name is null before
    }
}