import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Node> nodes = new ArrayList<>();
    //… constructors, getters, setters
    public void addNode(Node node) {
        nodes.add(node);
    }

    //… toString, etc.
}