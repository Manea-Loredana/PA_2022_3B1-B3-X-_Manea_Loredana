import java.util.Arrays;


public class Solution {

    //assignment[i] = what room received the event with index i
    private String[] assignment;

    static boolean isTaken(String[] s, String x) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == x) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    void computeUsedRooms(Problem pb) {
        Event[] event = pb.getEvents();
        Room[] room = pb.getRooms();
        String[] takenRooms = new String[room.length];
        assignment = new String[event.length];

        for (int i = 0; i < event.length; i++) {
            for (int j = 0; j < room.length; j++)
                if (event[i].getCapacity() == room[j].getCap() && !isTaken(takenRooms, room[j].getName())) {
                    assignment[i] = room[j].getName();
                    i++;
                    takenRooms[j] = room[j].getName();
                }
        }
        for (int x = 0; x < event.length; x++)
            for (int y = 0; y < event.length; y++) {
                if (event[x].getEndTime() == event[y].getStartTime() && event[x].getCapacity() == event[y].getCapacity())
                    assignment[y] = assignment[x];
            }
//
    }
//


    @Override
    public String toString() {
        return "Solution{" +
                "assignment=" + Arrays.toString(assignment) +
                '}';
    }
}




