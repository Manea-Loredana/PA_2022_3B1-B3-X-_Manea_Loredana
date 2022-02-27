import java.util.Objects;

public class Event {

    private String name;
    private int capacity;
    private int start;
    private int end;

    public Event() {
    }

    public Event(String name, int capacity, int start, int end) {
        this.name = name;
        this.capacity = capacity;
        this.start = start;
        this.end = end;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStartTime() {
        return start;
    }

    public void setStartTime(int start) {
        this.start = start;
    }

    public int getEndTime() {
        return end;
    }

    public void setEndTime(int end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    //set and get for name,capacity,start , end
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return getName().equals(event.getName());
    }

    @Override
    public String toString() {
        return getName() + "( " + "size= " + getCapacity() + "," + " start="
                + getStartTime() + ", " + "end=" + getEndTime() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

