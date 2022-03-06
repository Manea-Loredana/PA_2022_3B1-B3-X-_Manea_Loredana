

import java.util.Arrays;

public class Solution {
    private String[] computeUsedRooms;
    //assignment[i] = what room received the event with index i

    public String[] computeUsedRooms(Problem pb) {
        Event[] event = pb.getEvents();
        Room[] room = pb.getRooms();
        String[] assignment = new String[event.length];
        for (int i = 0; i < event.length ; i++)
            for(int j=0;j< room.length;j++)
            if (event[i].getCapacity()==room[j].getCap())
                assignment[i]= room[j].name;

        return assignment;
    }


    @Override
    public String toString() {
        return "Solution{" +
                "computeUsedRooms=" + Arrays.toString(computeUsedRooms) +
                '}';
    }



}




