import java.util.Arrays;

public class Problem {
    private Event[] events;
    private Room[] rooms;

    //constructor
    public Problem() {
    }

    public Problem(Event[] events, Room[] rooms) {
        this.events = events;
        this.rooms = rooms;

    }

    //setter and getter
    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "events=" + Arrays.toString(events) +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }




}
