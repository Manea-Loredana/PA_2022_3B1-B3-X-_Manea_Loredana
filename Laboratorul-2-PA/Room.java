import java.util.Objects;

public class Room {

    private String name;
    private RoomType type;
    private int cap;

    //constructor
    public Room() {
    }

    public Room(String name, RoomType type, int cap) {
        this.name = name;
        this.type = type;
        this.cap = cap;
    }

    public RoomType getType() {
        return type;
    }

    // … getters and setters
    public void setType(RoomType type) {
        this.type = type;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Indicates whether some other object is "equal to" this one.
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

    //The hashCode method takes as input an object (this) and
//returns a hash value for that object. This method is supported
//for the benefit of hash tables.
//● If two objects are equal according to the equals' method, they
//must produce the same integer hashCode
    @Override
    //my way (I make it to look like in example) and also use getters
    public String toString() {
        return getName() + " (" + " cap=" + getCap() + ")";
    }
    //alt+Ins way to creat toString
//    @Override
//    public String toString() {
//        return "Room{" +
//                "name='" + name + '\'' +
//                ", type=" + type +
//                ", cap=" + cap +
//                '}';
//    }
}
