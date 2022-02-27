public class Problem {
    private Event[] events;
    private Room[] rooms;

 //constructor
    public Problem() {
    }

    public Problem(  Event[] events,Room[] rooms) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("   ");//space for first line
        for(int i=0;i<getEvents().length;++i){
            sb.append(getEvents()[i].toString()).append(" ");
        }
        sb.append(" ");//pentru ultima linie afisata
        for(int i=0;i<getRooms().length;++i){
            sb.append(getRooms()[i].toString()).append(" ");
        }
        return sb.toString();
    }





}
