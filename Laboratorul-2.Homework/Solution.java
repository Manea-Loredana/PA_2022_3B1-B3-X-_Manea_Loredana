import java.util.Arrays;

public class Solution {

    //assignment[i] = what room received the event with index i
    private String[] assignment ;
     void computeUsedRooms(Problem pb) {
        Event[] event = pb.getEvents();
        Room[] room = pb.getRooms();
        assignment = new String[event.length];
        for (int i = 0; i < event.length; i++)
            for (Room value : room)
                if (event[i].getCapacity() == value.getCap())
                    assignment[i] = value.name;

    }

    @Override
    public String toString() {
        return "Solution{" +
                "Rooms used for each event in order=" + Arrays.toString(assignment) +
                '}';
    }
}




