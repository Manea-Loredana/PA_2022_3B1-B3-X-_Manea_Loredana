public abstract class Room {
    protected String name;

    private int cap;
    public Room() { }
    public Room(String name,int cap) {
        this.name = name;
        this.cap=cap;
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
//    @Override
//    public String toString() {
//        return "Room{" +
//                "name='" + name + '\'' +
//                ", type=" + type +
//                ", cap=" + cap +
//                '}';
//    }
}
