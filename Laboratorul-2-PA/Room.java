public class Room {

    private String name;
    private RoomType type;
    private int cap;

    //constructor
    public Room() { }

    public Room(String name, RoomType type,int cap) {
        this.name = name;
        this.type = type;
        this.cap=cap;
    }

    // … getters and setters
    public void setType(RoomType type) {
        this.type = type;
    }
    public RoomType getType() {
        return type;
    }
    public void setCap(int cap) {this.cap = cap;}
    public int getCap(){return cap;}
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }



    @Override
    // Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) {
            return false;
        }
        Room other = (Room) obj;
        return name.equals(other.name);
    }
    //my way (I make it to look like in example) and also use getters
    public String toString() {
        return getName() + " (" +" cap="+getCap()+")";
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
