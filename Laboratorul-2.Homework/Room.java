import java.util.Objects;

public abstract class Room {
    protected String name;

    private int cap;

    protected Room() {
    }

    protected Room(String name, int cap) {
        this.name = name;
        this.cap = cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // … getters and setters


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getName().equals(room.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String toString() {
        return getName() + " (" + " cap=" + getCap() + ")";
    }

}
