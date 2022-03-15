import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        var intersections = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection("intersection" + i))
                .toArray(Intersection[]::new);

        Set<Intersection> intersectionSet = new HashSet<>();
        intersectionSet.addAll(Arrays.asList(intersections));

        Street[] streetsArray = new Street[16];
        streetsArray[0] = new Street("street0", 3);
        streetsArray[1] = new Street("street1", 1);
        streetsArray[2] = new Street("street2", 2);
        streetsArray[3] = new Street("street3", 1);
        streetsArray[4] = new Street("street4", 1);
        streetsArray[5] = new Street("street5", 2);
        streetsArray[6] = new Street("street6", 1);
        streetsArray[7] = new Street("street7", 3);
        streetsArray[8] = new Street("street8", 2);
        streetsArray[9] = new Street("street9", 2);
        streetsArray[10] = new Street("street10", 2);
        streetsArray[11] = new Street("street11", 3);
        streetsArray[12] = new Street("street12", 2);
        streetsArray[13] = new Street("street13", 2);
        streetsArray[14] = new Street("street14", 2);
        streetsArray[15] = new Street("street15", 2);

        List<Street> streetList = new LinkedList<Street>();
        streetList.addAll(Arrays.asList(streetsArray));

        // Using lambdas
        Collections.sort(streetList, ((u, v) -> u.compareTo(v)));


    }

}