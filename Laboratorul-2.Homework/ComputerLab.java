import java.util.Objects;

/**
 * Class describing a Computer Lab ,
 * the class extends the class Room
 */
public class ComputerLab extends Room {
    private String so;


    /**
     * Default constructor.
     */
    public ComputerLab() {
    }

    /**
     * Constructor for a given name ,cap and so.
     *
     * @param name A String, the name of the room, inherit from room.
     * @param cap  An int, the capacity,inherit from room.
     * @param so   A String , represent the operating system present in the lab.
     */
    public ComputerLab(String name, int cap, String so) {
        super(name, cap);
        this.so = so;
    }

    /**
     * So getter.
     *
     * @return A String , represent the operating system present in the lab.
     */
    public String getSo() {
        return so;
    }

    /**
     * So setter.
     *
     * @param so A String  representing the new operating system installed on computers from that room.
     */
    public void setSo(String so) {
        this.so = so;
    }

    /**
     * Overridden method from Object class to check equality with another Computer lab.
     */
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

    /**
     * Gives a String representation of the Lab.
     *
     * @return A String, containing details of the Lab formatted.
     */
    @Override
    public String toString() {
        return getName() + " (" + " cap=" + getCap() + "," + "lab" + "," + "Operating system " + ":" + getSo() + ")";
    }

}
