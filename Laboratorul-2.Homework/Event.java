import java.util.Objects;

/**
 * Class describing a Event
 */
public class Event {

    private String name;
    private int capacity;
    private int start;
    private int end;

    /**
     * Default constructor.
     */
    public Event() {
    }

    /**
     * Constructor for a given name ,capacity , start time of the event and end time.
     *
     * @param name     A String, the name of the event.
     * @param capacity An int, the capacity.
     * @param start    An int , represent the start time of the event.
     * @param end      An int , represent the ending tme of the event.
     */
    public Event(String name, int capacity, int start, int end) {
        this.name = name;
        this.capacity = capacity;
        this.start = start;
        this.end = end;
    }

    /**
     * Capacity getter.
     *
     * @return An int, the capacity of the event.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Capacity setter.
     *
     * @param capacity An int representing the new capacity of the event.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Start getter.
     *
     * @return An int, the start time of the event.
     */
    public int getStartTime() {
        return start;
    }

    /**
     * Start setter.
     *
     * @param start An int representing the new start time of the event.
     */
    public void setStartTime(int start) {
        this.start = start;
    }

    /**
     * End getter.
     *
     * @return An int, the ending time of the event.
     */
    public int getEndTime() {
        return end;
    }

    /**
     * End setter.
     *
     * @param end An int representing the new ending time of the event.
     */
    public void setEndTime(int end) {
        this.end = end;
    }

    /**
     * Name getter.
     *
     * @return A String, the name of the event.
     */
    public String getName() {
        return name;
    }

    /**
     * Name setter.
     *
     * @param name A String representing the new name of the event.
     */
    //set and get for name,capacity,start , end
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Overridden method from Object class to check equality with another Event.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return getName().equals(event.getName());
    }

    /**
     * Gives a String representation of the Event.
     *
     * @return A String, containing details of the Event formatted.
     */
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

