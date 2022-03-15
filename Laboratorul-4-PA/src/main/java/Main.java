import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        var intersections = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection("intersection" + i))
                .toArray(Intersection[]::new);

        Set<Intersection> intersectionSet = new HashSet<>();
        intersectionSet.addAll(Arrays.asList(intersections));

        Street[] streetArray = new Street[16];
        streetArray[0] = new Street("street0", 3);
        streetArray[1] = new Street("street1", 1);
        streetArray[2] = new Street("street2", 2);
        streetArray[3] = new Street("street3", 1);
        streetArray[4] = new Street("street4", 1);
        streetArray[5] = new Street("street5", 2);
        streetArray[6] = new Street("street6", 1);
        streetArray[7] = new Street("street7", 3);
        streetArray[8] = new Street("street8", 2);
        streetArray[9] = new Street("street9", 2);
        streetArray[10] = new Street("street10", 2);
        streetArray[11] = new Street("street11", 3);
        streetArray[12] = new Street("street12", 2);
        streetArray[13] = new Street("street13", 2);
        streetArray[14] = new Street("street14", 2);
        streetArray[15] = new Street("street15", 2);

        List<Street> streetList = new LinkedList<Street>();
        streetList.addAll(Arrays.asList(streetArray));

        // Using lambdas
        Collections.sort(streetList, ((u, v) -> u.compareTo(v)));


    }

}