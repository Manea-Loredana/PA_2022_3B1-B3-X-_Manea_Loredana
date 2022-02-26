public class Room {
    private String name;
    private RoomType type;
    private int cap;
    public Room() { }
    public Room(String name, RoomType type,int cap) {
        this.name = name;
        this.type = type;
        this.cap=cap;
    }

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


    // … getters and setters
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) {
            return false;
        }
        Room other = (Room) obj;
        return name.equals(other.name);
    }
    public String toString() {
        return getName() + " (" +" cap="+getCap()+")";
    }

}
