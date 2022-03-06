import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.Map;

public abstract class Node implements Comparable<Location> {
    private String name;
    private Map<Node, Integer> cost = new HashMap<>();
    //… constructors, getters, setters
    public void setCost(Node node, int value) {
        cost.put(node, value);
    }
    //… toString, etc.



//    @Override
//    public int compareTo(Node other) {
//        return this.name.compareTo(other.name);
//        //not safe, check if name is null before
//    }
}